package StringsAndBasicsOfTextProcessing_3.stringlikeobject;
/*
* 6. Из заданной строки получить новую, повторив каждый символ дважды.
* */
public class Task_6 {
    public static void main(String[] args) {
        String string = "qwerty";
        System.out.println("string: " + string);
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            stringBuilder.insert(i + 1,stringBuilder.charAt(i));
            i++;
        }
        System.out.println("answer: " + stringBuilder);
    }
}
