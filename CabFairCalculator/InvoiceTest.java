import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InvoiceTest {
    private Invoice invoice;
    @BeforeEach
    public void init(){
         Ride ride1 = new Ride(2.0, 5, Ride.RideType.NORMAL);
        Ride ride2 = new Ride(0.5, 2, Ride.RideType.PREMIUM);
        invoice = new Invoice(Arrays.asList(ride1, ride2));
    }

    @Test
    void testGetTotalRide(){
        int totalRide=invoice.getTotalRides();
        assertEquals(2, totalRide,"The total ride test failed");
    }
    @Test
    void testCalculateTotalFair(){
        double totalFair=invoice.calculateTotalFair();
        assertEquals(45, totalFair,"The Total Fair Calculation in Invoice Failed");
    }
    @Test
    void testGetAverageFair(){
        double avgfair;
        avgfair=invoice.getAverageFare();
        assertEquals(22.5, avgfair,"Test Case for Average Fair Calculation Failed");
    }
}
