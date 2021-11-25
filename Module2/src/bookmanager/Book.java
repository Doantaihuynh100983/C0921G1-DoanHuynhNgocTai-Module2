package bookmanager;

import java.util.Objects;

enum Genre{
    NETWORK, AI, PROGRAMING;
}

public class Book{
    //__________________Properties_____________________________
    private int id;
    private String title;
    private String author;
    private Genre genre;
    private double price;
    private String isbn;

    //__________________Constructors___________________________
    public Book() {}

    public Book(int id, String title, String author, Genre genre, double price, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.isbn = isbn;
    }
    
    public Book(String title, String author, Genre genre, double price, String isbn) {        
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.price = price;
        this.isbn = isbn;
    }

    //__________________Getter & Setter_________________________
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //______________________equals__________________________________
    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Book)) {
            return false;
        }
        Book book = (Book) o;
        return id == book.id && title == book.title && author == book.author && Objects.equals(genre, book.genre);
    }

    //______________________hashCode__________________________________
    @Override
    public int hashCode() {
        return Objects.hash(id, title, author, genre);
    }

    //____________________toString________________________________
    @Override
    public String toString() {
        return "{" +
            " Id='" + getId() + "'" +
            ", title='" + getTitle() + "'" +
            ", author='" + getAuthor() + "'" +
            ", genre='" + getGenre() + "'" +
            "}";
    }

}