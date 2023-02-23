// В файле содержится строка с данными:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, 
// {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, 
// {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
// Напишите метод, который разберёт её на составные части и, используя StringBuilder создаст массив строк такого вида:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class Task3 {
    public static void main(String[] args) {
        String string = "[{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"}, {\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"}, {\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}]";
        string = string.replace('"', ' ').replace("{", "").replace("}", "").replace("[", "").replace("]", "")
                .replace(" ", "");
        printString(string);
    }

    private static void printString(String string) {
        String[] partString = string.split(",");
        for (int i = 0; i < partString.length; i += 3) {
            String[] part1 = partString[i].split(":");
            String[] part2 = partString[i + 1].split(":");
            String[] part3 = partString[i + 2].split(":");
            String value1 = part1[1], value2 = part2[1], value3 = part3[1];
            System.out.printf("Студент %s получил %s по предмету %s.\n", value1, value2, value3);
        }
    }
}
