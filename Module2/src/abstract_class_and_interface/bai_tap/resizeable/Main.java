package abstract_class_and_interface.bai_tap.resizeable;

import inheritance.bai_tap.bai4_shape.Shape;

public class Main {
    public static void main(String[] args) {
        GraphicObject [] gr = new GraphicObject[3];
        gr[0] = new Circle(5);
        gr[1] = new Rectangle(5 ,5);
        gr[2] = new Square(5);

        for (GraphicObject gr1 : gr){
            System.out.println(gr1);
            System.out.println("Diện tích trước khi tăng"+gr1.getArena());
            gr1.resize(Math.random()*100);
            System.out.println("Diện tích sau khi tăng"+gr1.getArena());

        }

    }
}
