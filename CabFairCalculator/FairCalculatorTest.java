import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FairCalculatorTest {
    @Test
    public void testNormalMinFair(){
        Ride normalRide=new Ride(0.2, 1, Ride.RideType.NORMAL);
        double fair;
        fair=FairCalculator.calculateFair(normalRide);
        assertEquals(5.0, fair);;
    }
    @Test
    public void testPremiumMinFair(){
        Ride premiumRide=new Ride(0.0, 1, Ride.RideType.PREMIUM);
        double fair;
        fair=FairCalculator.calculateFair(premiumRide);
        assertEquals(20.0, fair);;
    }

    @Test
    public void testCalculateFairNormal(){
        Ride normalRide=new Ride(1.0, 5, Ride.RideType.NORMAL);
        double fair;
        fair=FairCalculator.calculateFair(normalRide);
        assertEquals(15, fair);

    }
    @Test
    public void testCalculateFairPremium(){
        Ride premiumRide=new Ride(1.0, 5, Ride.RideType.PREMIUM);
        double fair;
        fair=FairCalculator.calculateFair(premiumRide);
        assertEquals(25, fair);
    }

}
