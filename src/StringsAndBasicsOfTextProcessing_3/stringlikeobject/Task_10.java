package StringsAndBasicsOfTextProcessing_3.stringlikeobject;

/*
 * 10. Строка X состоит из нескольких предложений,
 * каждое из которых кончается точкой,
 * восклицательным или вопросительным знаком.
 * Определить количество предложений в строке X.*/
public class Task_10 {
    public static void main(String[] args) {
        String string = "Are. You? Crazy!";
        System.out.println("string: " + string);
        int counter = 0;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == '.' || string.charAt(i) == '?' || string.charAt(i) == '!') {
                counter++;
            }
        }
        System.out.println("answer: there " + counter + " sentences");
    }
}
