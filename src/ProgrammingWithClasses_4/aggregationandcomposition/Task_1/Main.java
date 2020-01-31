package ProgrammingWithClasses_4.aggregationandcomposition.Task_1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * 1. Создать объект класса Текст, используя классы Предложение, Слово.
 * Методы: дополнить текст, вывести на консоль текст, заголовок текста.
 * */
public class Main {
    public static void main(String[] args) {
        LinkedList<Word> wordsLinkedList = new LinkedList<>();
        LinkedList<Sentence> sentencesLinkedList = new LinkedList<>();

        //создаём список слов
        wordsLinkedList.add(new Word("He"));
        wordsLinkedList.add(new Word("can"));
//        wordsLinkedList.add(new Word("fly"));

        //добавляем списко слов в список предложений = создаём предложение
        sentencesLinkedList.add(new Sentence(wordsLinkedList));
        sentencesLinkedList.get(0).addWord(new Word("fly")); //добавляем слово методом из Sentence
        sentencesLinkedList.get(0).addPunctuation("!");//добавляем знак пунктуации методом из Sentence

        LinkedList<Word> wordsLinkedList1 = new LinkedList<>();

        wordsLinkedList1.add(new Word("Hee"));
        wordsLinkedList1.add(new Word("to"));

        sentencesLinkedList.add(new Sentence(wordsLinkedList1));
        sentencesLinkedList.get(1).addPunctuation(".");

        Text text = new Text("About fly", sentencesLinkedList);

        System.out.println("\nahead: \n" + text.getTitle());
        System.out.println("\ntext: \n" + text.viewText());

        LinkedList<Word> wordsLinkedList2 = new LinkedList<>();

        wordsLinkedList2.add(new Word("And"));
        wordsLinkedList2.add(new Word("he"));
        wordsLinkedList2.add(new Word("too"));

        Sentence sentence = new Sentence(wordsLinkedList2);
        sentence.addPunctuation("!");

        text.addOneSentenceToText(sentence);

        System.out.println("\nafter add into text: \n" + text.viewText());


    }
}
