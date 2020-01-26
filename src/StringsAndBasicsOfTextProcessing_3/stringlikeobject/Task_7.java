package StringsAndBasicsOfTextProcessing_3.stringlikeobject;

/*
 * 7. Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы.
 * Например, если было введено "abc cde def", то должно быть выведено "abcdef".
 * */
public class Task_7 {
    public static void main(String[] args) {
        String string = "abc cde deff ";
        System.out.println("\nstring: " + string);
        StringBuilder stringBuilder = new StringBuilder(string);

        for (int i = 0; i < stringBuilder.length(); i++) {
            char temp = stringBuilder.charAt(i);
            for (int j = i + 1; j < stringBuilder.length(); j++) {
                if (stringBuilder.charAt(j) == ' ' || stringBuilder.charAt(j) == temp) {
                    stringBuilder.deleteCharAt(j);
                }
            }
        }
        System.out.println("answer: " + stringBuilder);
    }
}
