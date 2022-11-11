package shapes;

public class Shapes {

    public static void main(String[] args){
        Square mySquare = new Square(5.0);

        Rectangle myRectangle = new Rectangle(7.0, 3.5);

        mySquare.getArea();
        myRectangle.getArea();

        System.out.println(Math.PI);
    }
}
