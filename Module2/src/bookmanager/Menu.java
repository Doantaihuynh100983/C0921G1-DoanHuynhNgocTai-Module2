package bookmanager;

import java.util.ArrayList;

public abstract class Menu {
    //__________________Properties_____________________________
    private String title;
    private ArrayList<String> options = new ArrayList<>();

    //__________________Constructors___________________________
    public Menu(){}

    public Menu(String title, String[] options) {
        for (String option: options) this.options.add(option);
        this.title = title;
    }

    //__________________Getter & Setter_________________________
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<String> getOptions() {
        return this.options;
    }

    public void setOptions(ArrayList<String> options) {
        this.options = options;
    }

    //____________________Methods________________________________
    public void display(){
        System.out.printf("\n_______%-14s_______\n", title.trim().toUpperCase());
        for (int i=0; i<options.size(); i++)
            System.out.println((i+1) + ". " + options.get(i));
        System.out.println("0. Exit");
        System.out.println("--------------------");
    }

    public abstract void run();
}
