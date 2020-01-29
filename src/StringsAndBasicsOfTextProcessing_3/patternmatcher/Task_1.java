package StringsAndBasicsOfTextProcessing_3.patternmatcher;

import java.util.Arrays;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 * 1. Cоздать приложение, разбирающее текст (текст хранится в строке)
 * и позволяющее выполнять с текстом три различных операции:
 * - отсортировать абзацы по количеству предложений;
 * - в каждом предложении отсортировать слова по длине;
 * - отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
 * а в случае равенства – по алфавиту.*/
public class Task_1 {

    public static void main(String[] args) {
        String string = "Первый абзац а. Очень много. Я. Что же мне теперь делать Гага ты. Съел сегодня еды. Придётся много не есть теперь. \u2029" +
                        "Второй абзац а. Я. Очень много. Съел сегодня еды. \u2029" +
                        "Третий абзац а. Съел сегодня еды. Очень много. Я. Что же мне делать Гага ты. ";
        System.out.println("    string:\n" + string);

        System.out.println("    sorted sentences by length: ");
        sortBySentencesCountInParagraph(string);

        System.out.println("    sorted by length words in sentences:");
        sortByWordsLength(string);

        System.out.println("    sorted by leksema in sentences:");
        sortByLeksemaInSentences(string, "а");
    }

    public static void sortBySentencesCountInParagraph(String string){
        String[] paragraphArray = string.split("\\u2029");
        Pattern sentencePattern = Pattern.compile("([А-Яа-я0-9,\\-\\s]+\\.|!|\\?)");
        boolean flag = false;
        while (!flag){
            flag = true;
            int counter = 0;
            String tempString;
            for (int i = 0; i < paragraphArray.length; i++) {
                Matcher matcher = sentencePattern.matcher(paragraphArray[i]);
                int tempCounter = 0;
                    while (matcher.find()){
                        tempCounter++;
                    }
                    if(counter > tempCounter){
                        tempString = paragraphArray[i];
                        paragraphArray[i] = paragraphArray[i-1];
                        paragraphArray[i-1] = tempString;
                        flag = false;
                    }
                    counter = tempCounter;
            }
        }
        for (String s : paragraphArray) {
            System.out.println(s);
        }
    }

    public static void sortByWordsLength(String string){
        String[] sentencesArray = string.split("\\.\\s+");
        for (int i = 0; i < sentencesArray.length; i++) {
            String[] wordsArray = sentencesArray[i].split("\\s");
            sentencesArray[i] = "";
            Arrays.sort(wordsArray, new CustomStringComparator()); //использовал реализацию компаратора
/*          String temp;
            boolean flag = false;
            while (!flag) {
                flag = true;
                for (int j = 0; j < wordsArray.length-1; j++) {
                    if(wordsArray[j].length() > wordsArray[j+1].length()){
                        temp = wordsArray[j];
                        wordsArray[j] = wordsArray[j+1];
                        wordsArray[j+1] = temp;
                        flag = false;
                    }
                }
            }*/
            for (String s : wordsArray) {
                sentencesArray[i] += s + " ";
            }
            System.out.print(sentencesArray[i].trim() + ". ");
        }
        System.out.println();
    }

    public static void sortByLeksemaInSentences(String string, String letter){
        String[] sentencesArray = string.split("\\.\\s");
        for (String sentence: sentencesArray) {
            String[] wordsArray = sentence.split("\\s");
            Arrays.sort(wordsArray, new CustomLeksemaComparator(letter));
            String createSentences = "";
            for (String word : wordsArray) {
                createSentences += word + " ";
            }
            System.out.print(createSentences.trim() + ". ");
        }
        System.out.println();
    }
}

class CustomStringComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) { return Integer.compare(o1.length(), o2.length()); }
}

class CustomLeksemaComparator implements  Comparator<String> {

    private String letter;

    CustomLeksemaComparator(String letter){
        this.letter = letter;
    }

    @Override
    public int compare(String o1, String o2){ return Integer.compare(leksema(o2), leksema(o1)); }

    private int leksema(String string){
        Pattern pattern = Pattern.compile("\\.*"+letter+"\\.*");
        Matcher matcher = pattern.matcher(string);
        int counter = 0;
        while (matcher.find()) { counter++; }
        return counter;
    }
}

