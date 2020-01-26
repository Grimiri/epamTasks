package StringsAndBasicsOfTextProcessing_3.stringlikeobject;

/*
 * 8. Вводится строка слов, разделенных пробелами.
 * Найти самое длинное слово и вывести его на экран.
 * Случай, когда самых длинных слов может быть несколько, не обрабатывать.
 * */
public class Task_8 {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        System.out.println("\n" + string);
        String[] stringArray = string.split(" ");
        int counter = 0;
        int index = 0;
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > counter) {
                counter = stringArray[i].length();
                index = i;
            }
        }
        System.out.println("answer: the length of word - " + stringArray[index] + " is " + counter);
    }
}
