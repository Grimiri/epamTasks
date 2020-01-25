package StringsAndBasicsOfTextProcessing_3.workingwithastring;

/*
* 3. В строке найти количество цифр.
* */
public class Task_3 {
    public static void main(String[] args) {
        String str = "01aaaa2aaa345aaa67a89";
        char[] charArray = str.toCharArray();
        int counter = 0;

        for (char c : charArray) {
            if (Character.isDigit(c))
                counter++;
        }
        System.out.println("\nstring = " + str + ";\nanswer: count of digits = " + counter);
    }
}
