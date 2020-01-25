package StringsAndBasicsOfTextProcessing_3.workingwithastring;

/*
 * 1. Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.
 * */
public class Task_1 {
    public static void main(String[] args) {
        String[] stringArray = {"aFirstString", "bSecondString", "cThirdString"};

        for (int i = 0; i < stringArray.length; i++) {

            char[] charArray = stringArray[i].toCharArray();
            stringArray[i] = "";

            for (char c : charArray) {
                if (Character.isUpperCase(c))
                    stringArray[i] += "_" + String.valueOf(c).toLowerCase();
                else
                    stringArray[i] += c;
            }
        }

        System.out.println("answer:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i] + " ");

        }
    }



}
