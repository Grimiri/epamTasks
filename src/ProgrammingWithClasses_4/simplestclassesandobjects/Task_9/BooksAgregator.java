package ProgrammingWithClasses_4.simplestclassesandobjects.Task_9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BooksAgregator {

    private Book[] booksArray;

    BooksAgregator(Book[] booksArray){
        this.booksArray = booksArray;
    }

    public void outAuthorBooks(String author){
        Pattern pattern = Pattern.compile(author);
        for (Book book : booksArray) {
            Matcher matcher = pattern.matcher(book.getAuthor());
            if (matcher.find())
                System.out.println(book);
        }
    }

    public void outPublishersBooks(String publisher){
        Pattern pattern = Pattern.compile(publisher);
        for (Book book : booksArray) {
            Matcher matcher = pattern.matcher(book.getPublisher());
            if(matcher.find())
                System.out.println(book);
        }
    }

    public void outBooksAfterEnteredYear(int year){
        for (Book book : booksArray) {
            if ( book.getYearOfPublication() > year)
                System.out.println(book);
        }
    }
}
