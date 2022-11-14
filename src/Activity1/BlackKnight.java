package Activity1;
public class BlackKnight {
    private byte arms = 2;
    private byte legs = 2;
    private byte head = 1;
    private boolean alive = true;
    private String name;

    public static int numOfAliveKnights = 0;
    public static int numOfDeadKnights = 0;

    public static BlackKnight[] allKnights  = new BlackKnight[10];

    public void cutOffArm(){
        arms--;
    }

    public void cutOffLeg(){
        legs--;
    }

    public void cutOffHead(){
        head--;
    }

    @Override
    public String toString(){
        return "BlackKnight { " + "\n"+
                "name: "+name+ "\n"+
                "arms: "+ arms+ "\n"+
                "legs: "+ legs+ "\n"+
                "head: "+ head+ "\n"+
                "alive: "+ alive+ "\n"+
                " }";
    }

    public void strike(){
        if(alive){
            if(arms > 0){
                cutOffArm();
            }else if(legs > 0){
                cutOffLeg();
            }else {
                cutOffHead();
                alive = !alive;
            }
        } else {
            System.out.println("Stop! He's already dead");
        }
    }

    public BlackKnight(String name){
        this.name = name;
    }

    // constructor overload
    public BlackKnight(){
        this.name = "Anonymous Knight";
    }

    public static void main(String[] args){
        BlackKnight knight1 = new BlackKnight("Arthur");
        allKnights[0] = knight1;
        BlackKnight.numOfAliveKnights++;

        BlackKnight knight2 = new BlackKnight();
        System.out.println(knight2.toString());



        ////////
        // int, String, boolean
        int myInteger = 4;


        BlackKnight[] myBlackKnightArray;

        myBlackKnightArray = new BlackKnight[7];
    }


}


/*
 Road ===> from, to, distance(50km), arrived | methods ==> getters and setters, toString | create constructor to set empty values for all fields
 Transport ===> id, consumption = 10/100km, fuelTank(1l) | methods ==> getters and setters, toString, move(road)

 TransportManagement ===> static Array of transports, roads | methods:
            initSystem(5, 7)
            getTransports, getRoads, setRoad(roadObject, index), setTransport(transportObject, index)


 */