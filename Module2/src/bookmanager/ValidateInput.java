package bookmanager;

import java.util.Scanner;

public class ValidateInput {
    public static Scanner sc = new Scanner(System.in);
    private final String[] ISBN_REGEX = {
        "^([0-9]{5})-([0-9]{2})-([0-9]{2})-([0-9])$",
        "^([0-9]{4})-([0-9]{1})-([0-9]{4})-([0-9])$",
        "^([0-9]{3})-([0-9]{3})-([0-9]{3})-([0-9])$",
        "^([0-9]{2})-([0-9]{6})-([0-9]{1})-([0-9])$",
        "^([0-9]{2})-([0-9]{3})-([0-9]{4})-([0-9])$"
    };
    

    public String getString(){
        boolean isFirst = true;                
        for (;;){
            String res = sc.nextLine().trim();
            if (res.equals("")){
                if (!isFirst) System.err.println("CANNOT EMPTY!");                
            } 
            else return res;
            isFirst = false;
        }
    }

    public String getISBN(){
        for (;;){
            String res = this.getString();
            if (
                !res.matches(ISBN_REGEX[0])
                && !res.matches(ISBN_REGEX[1])
                && !res.matches(ISBN_REGEX[2])
                && !res.matches(ISBN_REGEX[3])
                && !res.matches(ISBN_REGEX[4])
            ){
                System.err.println("ISBN IS INVALID!");
            }
            else return res;
        }
    }

    public Double getDouble(){
        return sc.nextDouble();
    }

    public int getInt(int min, int max){
        for (;;){
            int res = sc.nextInt();
            if (res < min || res > max){
                System.err.println("PLEASE INPUT IN RANGE [" + min + ", " + max + "]");
            }
            else return res;
        }
    }

    public int getInt(){
        return sc.nextInt();
    }

    public Genre getGenre(){                        
        int res = this.getInt(1, 3);            
        return Genre.values()[res-1];
    }
}
