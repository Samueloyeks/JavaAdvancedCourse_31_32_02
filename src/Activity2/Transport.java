package Activity2;

import java.util.Random;

public class Transport {
    private int id;
    private float consumption; // per 100km
    private float tank;

    public int getId() {
        return id;
    }

    public float getConsumption() {
        return consumption;
    }

    public float getTank() {
        return tank;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public void setTank(float tank) {
        this.tank = tank;
    }

    private int generateId(){
        Random random = new Random();

        return random.nextInt(100);
    }

    public Transport(float consumption, float tank){
        this.consumption = consumption;
        this.tank = tank;
        this.id = generateId();
    }

    public void move(Road road){
        if(road.getArrived()){
            System.out.println("This journey has been made");
            return;
        }

        float consumptionFor1km = consumption/ 100;
        float consumptionForJourney = consumptionFor1km * road.getDistance();

        if(tank >= consumptionForJourney){
            tank -= consumptionForJourney;
            road.setArrived(true);
            System.out.println("Journey was successful");
        } else {
            System.out.println("Transport doesn't have enough fuel");
        }
    }
}
