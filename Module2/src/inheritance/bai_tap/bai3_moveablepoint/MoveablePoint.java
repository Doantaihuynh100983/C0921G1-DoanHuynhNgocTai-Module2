package inheritance.bai_tap.bai3_moveablepoint;

public class MoveablePoint  extends Point{
    protected float xSpeed = 0.0f;
    protected float ySpeed = 0.0f;

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x=" + x +
                ", y=" + y +
                '}';
    }

    public void setSpeed(float xSpeed , float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        float arr1[] = new float[2];
        arr1[0] = this.xSpeed;
        arr1[1] = this.ySpeed;
        return arr1;
    }
    public MoveablePoint move(){
        x += xSpeed ;
        y += ySpeed;
        return this;
    }


}
