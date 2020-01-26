package StringsAndBasicsOfTextProcessing_3.stringlikeobject;

/*
 * 5. Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.
 * */
public class Task_5 {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        System.out.println(string);
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println("answer = " + counter);
    }
}
