package ProgrammingWithClasses_4.aggregationandcomposition.Task_1;

import java.util.LinkedList;

public class Sentence {

    private LinkedList<Word> sentence;

    Sentence(LinkedList<Word> sentence) {
        this.sentence = sentence;
    }

    public void addWord(Word word) {
        sentence.add(word);
    }

    public void addPunctuation(String string) {
        sentence.add(new Word(string));
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Word word : sentence) {
            stringBuilder.append(word.toString()).append(" ");

        }
        return stringBuilder.toString();
    }
}
