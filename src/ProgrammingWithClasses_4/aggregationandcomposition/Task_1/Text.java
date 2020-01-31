package ProgrammingWithClasses_4.aggregationandcomposition.Task_1;

import java.util.LinkedList;

public class Text {
    private String title;
    private LinkedList<Sentence> text;

    public String getTitle() {
        return this.title;
    }

    Text(String title, LinkedList<Sentence> text) {
        this.title = title;
        this.text = text;
    }

    public void addSentencesToText(LinkedList<Sentence> sentences) {
        text.addAll(sentences);
    }

    public void addOneSentenceToText(Sentence sentence) {
        text.add(sentence);
    }

    public String viewText() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Sentence s : text) {
            stringBuilder.append(s.toString()).append(" ");
        }
        return stringBuilder.toString();
    }


}
