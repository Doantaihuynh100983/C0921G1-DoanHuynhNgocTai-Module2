package ClassAndObijectInJAVA.bai_tap.quadraticEquation;

public class QuadraticEquation {
 private double a , b ,c ;
 public  QuadraticEquation(){

 }
    public QuadraticEquation( double a , double b , double c ){
            this.a = a ;
            this.b = b ;
            this.c = c ;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
     return this.b ;
    }
    public double getC(){
     return this.c ;

    }
    public double getDiscriminant(){
     return Math.pow(this.b , 2) - 4 * a * c ;
    }
    public double  getRoot1(){
     return (-b+Math.sqrt(getDiscriminant()))/(2*a);
    }
    public double  getRoot2(){
        return (-b-Math.sqrt(getDiscriminant()))/(2*a);
    }

    public void giaiPhuongTrinh(){
        if (getDiscriminant() > 0){
            System.out.println("Phương trình có 2 nghiệm ");
            System.out.println("Nghiệm thứ nhất : " + getRoot1());
            System.out.println("Nghiệm thứ hai : " + getRoot2());
        }else if(getDiscriminant() == 0){
            System.out.println("Phương trình có hai nghiệm kép : " + "X1 = " + getRoot1() + "X2 = " +getRoot2() );
        }else {
            System.out.println("Phương trình vô nghiệm");
        }
    }

}
