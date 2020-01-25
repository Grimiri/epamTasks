package StringsAndBasicsOfTextProcessing_3.stringlikeobject;
/*
* 1. Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.
* */
public class Task_1 {
    public static void main(String[] args) {
        String string = "Lorem ipsum    dolor   sit amet,           consectetur adipiscing elit, " +
                "sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.";
        StringBuilder stringBuffer = new StringBuilder(string);
        System.out.println("\n" + stringBuffer);
        int counter = 0;
        int temp = 0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            if(Character.isSpaceChar(stringBuffer.charAt(i))){
                temp++;
                if(counter < temp){
                    counter = temp;
                }
            }
            else temp = 0;
        }
        System.out.println("\nanswer: max spaces count between words = " + counter);

    }
}
