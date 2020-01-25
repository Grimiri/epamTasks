package StringsAndBasicsOfTextProcessing_3.workingwithastring;

/*
* 2. Замените в строке все вхождения 'word' на 'letter'
* */
public class Task_2 {
    public static void main(String[] args) {
        String str = "1wordqwertyword0word;wordword";
        System.out.println(str.replace("word", "letter"));
    }
}
