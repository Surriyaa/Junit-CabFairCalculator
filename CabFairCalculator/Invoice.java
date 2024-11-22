import java.util.List;

public class Invoice {
    private List<Ride> rides;

    public Invoice(List<Ride> rides) {
        this.rides = rides;
    }
    
    public int getTotalRides(){
        return rides.size();
    }
    public double calculateTotalFair(){
        double totalFair=0;
        for(Ride ride:rides){
            totalFair+=FairCalculator.calculateFair(ride);
        }
        return totalFair;
    }
    public double getAverageFare(){
        return calculateTotalFair()/getTotalRides();
    }

    public void printInvoice(){
        System.out.println("Total Number of Rides "+getTotalRides());
        System.out.println("Total Fair "+calculateTotalFair());
        System.out.println("Average Fare Per Ride "+getAverageFare());
    }
}
