package ProgrammingWithClasses_4.simplestclassesandobjects.Task_9;

import javax.sound.midi.Soundbank;

/*
* 9. Создать класс Book, спецификация которого приведена ниже.
* Определить конструкторы, set- и get- методы и метод toString().
* Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и методами.
* Задать критерии выбора данных и вывести эти данные на консоль.
*
* Book: id, название, автор(ы), издательство, год издания,
* количество страниц, цена, тип переплета.
*
* Найти и вывести:
* a) список книг заданного автора;
* b) список книг, выпущенных заданным издательством;
* c) список книг, выпущенных после заданного года.
* */
public class Main {
    public static void main(String[] args) {
        Book[] booksArray = new Book[5];

        booksArray[0] = new Book(1, "Girl without name", "Robotnik", "WritersCo", 1956, 246, 13, "A");
        booksArray[1] = new Book(2, "Harry Potter", "Rouling", "RoulingsCo", 2000, 403, 53, "S");
        booksArray[2] = new Book(3, "Lolita", "Nabokov", "WritersCo", 1946, 301, 25, "A");
        booksArray[3] = new Book(4, "At road", "Keruak", "NiceBooksCo", 1988, 250, 30, "S");
        booksArray[4] = new Book(5, "The strangest pab", "Robotnik", "WritersCo", 1995, 125, 20, "A");

        BooksAgregator booksAgregator = new BooksAgregator(booksArray);

        System.out.println("\nbooks authored by Robotnik: ");
        booksAgregator.outAuthorBooks("Robotnik");

        System.out.println("\nbooks published by WritersCo: ");
        booksAgregator.outPublishersBooks("WritersCo");

        System.out.println("\nbooks after 1987 year: ");
        booksAgregator.outBooksAfterEnteredYear(1987);


    }
}
