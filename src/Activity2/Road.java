package Activity2;

public class Road {
    private String from;
    private String to;
    private float distance;

    private boolean arrived = false;

    public void setFrom(String from) {
        this.from = from;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public void setArrived(boolean arrived) {
        this.arrived = arrived;
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public float getDistance() {
        return distance;
    }

    public boolean getArrived(){
        return arrived;
    }

    public Road(String from, String to, float distance){
        this.from = from;
        this.to = to;
        this.distance = distance;
    }

    public Road(){
        this.from = "";
        this.to = "";
        this.distance = 0;
    }
}
