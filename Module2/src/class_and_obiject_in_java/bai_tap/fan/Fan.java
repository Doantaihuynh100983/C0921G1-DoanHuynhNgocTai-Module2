package class_and_obiject_in_java.bai_tap.fan;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;
    private int speed;
    private boolean on = false ;
    private double  radius = 5 ;
    private String color = "blue";

    public int getSlow(){
        return this.SLOW;
    }
    public int getMEDIUM(){
        return this.MEDIUM;
    }
    public int getFAST(){
        return this.FAST;
    }
    public int getSpeed(){
        return this.speed;
    }
    public boolean getOn(){
        return this.on;
    }
    public double getRadius(){
        return this.radius;
    }
    public String getColor(){
        return this.color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public void setOn(boolean on) {
        this.on = on;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public Fan(){
        this.speed = this.SLOW ;
    }
    public Fan(int speed , boolean on ,double radius , String color){
        this.speed = this.SLOW ;
        this.on = on ;
        this.radius = radius ;
        this.color = color;

    }
    public String toString(){
        if (this.on == true){
            return "Tốc Độ :" + this.speed + " - " + " color :" + this.color + " - " + " radius : " + this.radius + "fan is on" ;
        }
        return "fan is off" ;

    }
}
