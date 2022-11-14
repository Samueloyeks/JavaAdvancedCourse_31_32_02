package Activity2;

public class TransportManagement {
    public static Transport[] transports;
    public static Road[] roads;

    public void initSystem(int transportsSize, int roadsSize){
        transports = new Transport[transportsSize];
        roads = new Road[roadsSize];
    }

    public void setRoad(Road road, int index){
        if(index >= transports.length || index < 0){
            System.out.println("sorry index is out of bounds");
            return;
        }

        roads[index] = road;
    }

    public void setTransport(Transport transport, int index){
        if(index >= transports.length || index < 0){
            System.out.println("sorry index is out of bounds");
            return;
        }

        transports[index] = transport;
    }

    public static Transport[] getTransports() {
        return transports;
    }

    public static Road[] getRoads() {
        return roads;
    }

    public static void main(String[] args){
        Transport transport1 = new Transport(10, 20);
        Road road1 = new Road("Riga", "Vilnius", 200);
        Road road2 = new Road("Vilnius", "Tallinn", 300);
        Road road3 = new Road("Tallinn", "Warsaw", 150);

        TransportManagement transportManagement = new TransportManagement();

        transportManagement.initSystem(5,5);
        // set transports
        transportManagement.setTransport(transport1, 0);
        // set roads
        transportManagement.setRoad(road1, 0);
        transportManagement.setRoad(road2, 1);
        transportManagement.setRoad(road3, 2);

        for(Road road: roads){
            if(road != null){
                transports[0].move(road);
            }
        }
    }
}
