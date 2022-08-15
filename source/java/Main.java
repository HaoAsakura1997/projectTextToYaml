import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        String src = "source/resources/table.csv";
        File file = new File(src);
        Scanner scanner = new Scanner(file);

        String[] head = scanner.nextLine().split("\t");
        for (String h : head) {
            System.out.println(h);
        }
    }

    static public String toYaml(String[] values) {
        StringBuilder sb = new StringBuilder();
        String headersYaml = "databaseChangeLog: \n" +
                "\t- changeSet: \n" +
                "\t\tid: " + "addToBoardGroups\n" +
                "\t\tauthor: " + "Auezov Kuanysh\n" +
                "\t\tchanges: \n";
        sb.append(headersYaml);
        for (String temp : values) {

        }
        String template = String.format(
                "\t\t\t- insert:\n" +
                        "\t\t\t\ttableName: board_group\n" +
                        "\t\t\t\tcolumns:\n" +
                        "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: id\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: trade_engine_id\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: trade_engine_name\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: trade_engine_title\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: market_id\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: market_name\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: name\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: title\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: is_default\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: board_group_id\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: is_traded\n" +
                        "\t\t\t\t\tvalue" + "%s\n"
                "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: is_order_driven\n" +
                        "\t\t\t\t\tvalue" + "%s\n" +
                        "\t\t\t\t\t- column:\n" +
                        "\t\t\t\t\tname: category\n" +
                        "\t\t\t\t\tvalue" + "%s\n",

                // Распарсить csv и раскидать сюда в стринг формат по индексам массива значения!!!


        )
    }
}

