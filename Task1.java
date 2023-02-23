// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * 
// FROM students 
// WHERE name = "Ivanov" 
// AND country = "Russia" 
// AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder. 
// Значения null не включаются в запрос.

public class Task1 {
    public static void main(String[] args) {
        String string = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        string = string.replace('"', ' ').replace("{", "").replace(" ", "");
        printString(string);
    }

    private static void printString(String string) {
        String[] partString = string.split(",");

        String[] part1 = partString[0].split(":");
        String[] part2 = partString[1].split(":");
        String[] part3 = partString[2].split(":");

        String key1 = part1[0], value1 = part1[1];
        String key2 = part2[0], value2 = part2[1];
        String key3 = part3[0], value3 = part3[1];

        System.out.printf(
                "SELECT * \nFROM students \nWHERE %s = %s \nAND %s = %s \nAND %s = %s;",
                key1, value1, key2, value2, key3, value3);
    }

}
