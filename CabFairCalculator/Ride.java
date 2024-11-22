public class Ride {
    private double distance;
    private int time;
    private RideType rideType;
    
    public enum RideType{
        NORMAL,PREMIUM;
    }
    Ride(double distance,int time,RideType rideType){
        this.distance=distance;
        this.time=time;
        this.rideType=rideType;
    }
    public double getDistance() {
        return distance;
    }
    public int getTime() {
        return time;
    }
    public RideType getRideType() {
        return rideType;
    }
    
}
