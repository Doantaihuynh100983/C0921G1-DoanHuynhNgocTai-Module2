package test_doc_ghi_file.s15_exception;

public class Demo1 {
    public static String print(String s){
        try {
            if(s=="x"){
                throw new NullPointerException();
            }
            return s + "_9"; //Dat
        } catch (NullPointerException e){
            System.out.println("Co ngoai le");
        } finally {
            System.out.println("Ket thuc chuong trinh");
        }
        return s + "_15"; //Long
    }

    public static void main(String[] args) {
        System.out.println(print("x")); //x //ket thuc ct..
    }
}
