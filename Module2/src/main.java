public class main {
    public static void main(String[] args) {
        String txt = "10/20/2019";
        String [] txxs = txt.split("/");
        for (int i = 0 ; i < txxs.length ; i++){
            System.out.println(txxs[i]);
        }
    }
}
