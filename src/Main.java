import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        LocalDate carManufacturingDate = LocalDate.now();


        SportsCar sportsCar = new SportsCar(carManufacturingDate);
        sportsCar.carInfo();
    }
}

// parent class
class Car {
    private LocalDate manufacturingDate;

    public Car(LocalDate manufacturingDate){
        this.manufacturingDate = manufacturingDate;
    }
    void turnOnEngine(){
        System.out.println("Engine is running...!");
    }

    public LocalDate getManufacturingDate(){
        return manufacturingDate;
    }
}

// child class
class SportsCar extends Car {
    public SportsCar(LocalDate manufacturingDate){
        super(manufacturingDate);
    }
    @Override
    void turnOnEngine(){
        System.out.println("Sports car engine is running...!");
    }

    public void drive(){
        turnOnEngine();
        System.out.println("I'm driving!");
    }

    public void carInfo(){
        System.out.println("Car was built on: "+ this.getManufacturingDate());
    }
}