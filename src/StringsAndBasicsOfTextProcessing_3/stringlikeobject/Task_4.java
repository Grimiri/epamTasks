package StringsAndBasicsOfTextProcessing_3.stringlikeobject;
/*
* 4. С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.
* */
public class Task_4 {
    public static void main(String[] args) {
        String informatika = "информатика"; // == "торт"
        String tort = "торт";
        String rezult = "";
        for (int i = 0; i < tort.length(); i++) {
            for (int j = 0; j < informatika.length(); j++) {
                if(informatika.charAt(j) == tort.charAt(i)){
                    rezult += informatika.charAt(j);
                }
            }
        }
        System.out.println("answer: " + rezult);
    }
}
