package bookmanager;

import java.util.ArrayList;

public class BookList{
    //__________________Properties_____________________________
    private ArrayList<Book> list = new ArrayList<>();

    //__________________Constructors___________________________
    public BookList() {
    }

    public BookList(ArrayList<Book> list) {
        this.list = list;
    }

    //__________________Getter & Setter_________________________
    public ArrayList<Book> getList() {
        return this.list;
    }

    public void setList(ArrayList<Book> list) {
        this.list = list;
    }

    //____________________Method__________________________________
    public void add(Book book){
        book.setId(this.list.size());
        this.list.add(book);
        System.out.println("Add succesfully!");
    }

    public Book getByID(int id){
        return this.list.get(id);
    }

    public ArrayList<Book> getAll(){
        return this.list;
    }

    public void update(int id, Book book){
        this.list.set(id, book);
        System.out.println("Update succesfully!");
    }

    public void delete(int id){
        this.list.remove(id);
        System.out.println("Delete succesfully!");
    }

    public ArrayList<Book> findByTitle(String partTitle){
        ArrayList<Book> result = new ArrayList<>();
        for (Book book: this.list){
            if (book.getTitle().contains(partTitle)) result.add(book);
        }
        return result;
    }
 
    public int size(){
        return this.list.size();
    }

    //____________________toString________________________________
    @Override
    public String toString() {
        return "{" +
            " list='" + getList() + "'" +
            "}";
    }

}