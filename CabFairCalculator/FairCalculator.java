
public class FairCalculator{
    public static final double NORMAL_FAIR_PER_KM=10;
    public static final int NORMAL_FAIR_PER_MIN=1;
    public static final double MIN_FAIR_NORMAL=5;

    public static final double PREMIUM_FAIR_PER_KM=15;
    public static final int PREMIUM_FAIR_PER_MIN=2;
    public static final double MIN_FAIR_PREMIUM=20;

    public static double calculateFair(Ride ride){
        double fair;
        if(ride.getRideType()==Ride.RideType.NORMAL){
            fair=(ride.getDistance()*NORMAL_FAIR_PER_KM)+(ride.getTime()*NORMAL_FAIR_PER_MIN);
            return Math.max(fair, MIN_FAIR_NORMAL);
        }
        else if (ride.getRideType()==Ride.RideType.PREMIUM){
            fair=(ride.getDistance()*PREMIUM_FAIR_PER_KM)+(ride.getTime()*PREMIUM_FAIR_PER_MIN);
            return Math.max(fair,MIN_FAIR_PREMIUM);
        }  
        else{
            return 0.0;
        }  
    }

}