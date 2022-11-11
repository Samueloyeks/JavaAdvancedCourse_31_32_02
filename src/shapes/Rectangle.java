package shapes;

public class Rectangle extends ICorneredShape{

    public Rectangle(Double length, Double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public void getArea(){
        System.out.println(length * width);
    }

}
