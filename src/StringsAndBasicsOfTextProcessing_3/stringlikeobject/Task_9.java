package StringsAndBasicsOfTextProcessing_3.stringlikeobject;

/*
* 9. Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.
* */
public class Task_9 {
    public static void main(String[] args) {
        String string = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        System.out.println("string:\n" + string);
        int upCounter = 0;
        int lowCounter = 0;
        for (int i = 0; i < string.length(); i++) {
            if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                upCounter++;
            }
            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                lowCounter++;
            }
        }
        System.out.println("answer:\nupper case = " + upCounter + " lower case = " + lowCounter);
    }
}
