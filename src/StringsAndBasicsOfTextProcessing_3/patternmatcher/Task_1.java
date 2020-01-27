package StringsAndBasicsOfTextProcessing_3.patternmatcher;

import java.util.Arrays;
import java.util.Comparator;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * - отсортировать абзацы по количеству предложений;
 * - в каждом предложении отсортировать слова по длине;
 * - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.*/
public class Task_1 {

    public static void main(String[] args) {
        String string = "Lorem ipsum a. Lorem ipsum a dolor ime. \u2029Lorem ipsum a dolor ime. \u2029Lorem.";
        System.out.println("    string:\n" + string);
        System.out.println("    sorted sentences by length: ");
        for (String s : sortByU2029Length(string)) {
            System.out.println(s);
        }
        System.out.println("    sorted words by length: ");
        for (String s : sortWordsByLength(string)) {
            System.out.println(s);
        }
    }

    public static String[] sortByU2029Length(String str) {
        String[] strArray = str.split("\\u2029");
        Arrays.sort(strArray, new CustomStringComparator());
        return strArray;
    }

    public static String[] sortWordsByLength(String str){
        String[] strArray = str.split("\\.");
        for (String s : strArray) {
            String[] strings = s.split("\\s");
            s = "";
            Arrays.sort(strings, new CustomStringComparator());
            for (String s2 : strings) {
                s += s2 + " ";
            }
        }
        return strArray;
    }
}

class CustomStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return Integer.compare(o1.length(), o2.length());
    }
}

