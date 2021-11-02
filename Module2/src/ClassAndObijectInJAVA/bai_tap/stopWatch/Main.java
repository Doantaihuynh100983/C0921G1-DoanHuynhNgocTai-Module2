package ClassAndObijectInJAVA.bai_tap.stopWatch;

public class Main {
    public static void main(String[] args) {
       StopWatch sc = new StopWatch();
      sc.start();
        System.out.println(sc.getStartTime());
        for (int i = 0 ; i < 100 ; i++){
            sc.stop();
            System.out.println(sc.getEndTime());

        }
        System.out.println(sc.getElapsedTime());


    }
}
