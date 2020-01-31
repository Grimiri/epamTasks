package ProgrammingWithClasses_4.simplestclassesandobjects.Task_9;

public class Book {

    private long id;
    private String title;
    private String author;
    private String publisher;
    private int yearOfPublication;
    private int countOfPage;
    private int cost;
    private String binding;

    public Book(long id, String title, String author, String publisher, int yearOfPublication, int countOfPage, int cost, String binding) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.yearOfPublication = yearOfPublication;
        this.countOfPage = countOfPage;
        this.cost = cost;
        this.binding = binding;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearOfPublication=" + yearOfPublication +
                ", countOfPage=" + countOfPage +
                ", cost=" + cost +
                ", binding='" + binding + '\'' +
                '}';
    }
}
