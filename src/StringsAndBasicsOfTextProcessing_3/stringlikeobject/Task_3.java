package StringsAndBasicsOfTextProcessing_3.stringlikeobject;
/*
* 3. Проверить, является ли заданное слово палиндромом.
* */
public class Task_3 {
    public static void main(String[] args) {
        String a = "allallalla";//false

        System.out.println("\nstring = " + a + "\nanswer: is the word palindrome? " + isPalindrome(a));
    }

    public static boolean isPalindrome(String string){
        StringBuilder stringBuilder = new StringBuilder(string);
        for (int i = 0; i < stringBuilder.length(); i++) {
            if(stringBuilder.charAt(i) != stringBuilder.reverse().charAt(i)){
                return false;
            }
        }
        return true;
    }
}
