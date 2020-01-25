package StringsAndBasicsOfTextProcessing_3.workingwithastring;
/*
* 4. В строке найти количество чисел.
* */
public class Task_4 {
    public static void main(String[] args) {
        String str = "123eee23ee e67834eee321";
        char[] charArray = str.toCharArray();
        int counter = 0;
        boolean flag = false;

        for (char c: charArray) {
            if (Character.isDigit(c) && !flag) {
                flag = true;
                counter++;
            }
            else if(!Character.isDigit(c)) {
                flag = false;
            }
        }
        System.out.println("\nstring = " + str + ";\nanswer: count of numbers = " + counter);
    }
}
