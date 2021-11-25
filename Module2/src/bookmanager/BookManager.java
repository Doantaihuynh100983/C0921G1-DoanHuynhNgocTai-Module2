package bookmanager;

import java.util.ArrayList;

public class BookManager extends Menu {
    //__________________Properties_____________________________
    final static ValidateInput input = new ValidateInput();
    private BookList bookList = new BookList();
    static String[] menu = {
        "Add book",
        "Find by title",
        "Update or Delete",
        "Report"        
    };

    //__________________Constructors___________________________
    public BookManager(){
        super("Book Manager", menu);
        bookList.add(new Book("Java", "Horstmann", Genre.PROGRAMING, 21, "99921-58-10-7"));
        bookList.add(new Book("Security Network", "Jack", Genre.NETWORK, 30,  "9971-5-0210-0"));
        bookList.add(new Book("Learning Python", "Mark", Genre.AI, 46, "960-425-059-0"));
    }    

    //__________________Getter & Setter_________________________

    //____________________Method________________________________    
    public void show(String title, ArrayList<Book> list){
        System.out.printf("_______%s_______\n", title);
        System.out.printf("%-5s%-20s%-15s%-15s%-10s%-10s\n", "ID", "Title", "Author", "Genre", "Price", "ISBN");
        for (Book book: list){
            System.out.printf(
                "%-5d%-20s%-15s%-15s%-10f%-10s\n",
                book.getId(),
                book.getTitle(),
                book.getAuthor(),
                book.getGenre(),
                book.getPrice(),
                book.getIsbn()
            );
        }
    }

    public void addBook(){
        Book book = new Book();
        System.out.print("Enter title: "); book.setTitle(input.getString());
        System.out.print("Enter author: "); book.setAuthor(input.getString());
        System.out.println("1. " + Genre.values()[0]);
        System.out.println("2. " + Genre.values()[1]);
        System.out.println("3. " + Genre.values()[2]);
        System.out.print("Enter genre: "); book.setGenre(input.getGenre());
        System.out.print("Enter price: "); book.setPrice(input.getDouble());
        System.out.println("Please input ISBN flow format: ");
        System.out.println("• xxxxx-xx-xx-x");
        System.out.println("• xxxx-x-xxxx-x");
        System.out.println("• xxx-xxx-xxx-x");
        System.out.println("• xx-xxxxxx-x-x");
        System.out.println("• xx-xxx-xxxx-x");            
        System.out.print("Enter IBSN: "); book.setIsbn(input.getISBN());

        bookList.add(book);
    }

    public void findBook(){
        System.out.print("Enter title: ");
        String partTitle = input.getString();
        show("Result for `" + partTitle +"`", bookList.findByTitle(partTitle));
    }

    public void updateOrDelete(){
        System.out.print("Enter Book ID: ");
        int id = input.getInt(1, bookList.size());
        Book book = bookList.getByID(id);
        System.out.println("Do you want to update (U) or delete (D) book ?");
        String s = input.getString();
        if (s.equals("U")){
            System.out.println("Please enter new information for update: ");
            System.out.print("Enter title: "); book.setTitle(input.getString());
            System.out.print("Enter author: "); book.setAuthor(input.getString());
            System.out.println("1. " + Genre.values()[0]);
            System.out.println("2. " + Genre.values()[1]);
            System.out.println("3. " + Genre.values()[2]);
            System.out.print("Enter genre: "); book.setGenre(input.getGenre());
            System.out.print("Enter price: "); book.setPrice(input.getDouble());
            System.out.print("Enter IBSN: "); book.setIsbn(input.getISBN());
            bookList.update(id, book);            
        } 
        else bookList.delete(id);
    }

    public void report(){
        show("All books", bookList.getAll());
    }

    @Override
    public void run() {
        for (;;){
            this.display();
            System.out.print(">>> ");
            int selected = input.getInt(1, menu.length);
            switch (selected) {
                case 1: addBook(); break;
                case 2: findBook(); break;
                case 3: updateOrDelete(); break;
                case 4: report(); break;
                default:
                    break;
            }
        }
    }

}
