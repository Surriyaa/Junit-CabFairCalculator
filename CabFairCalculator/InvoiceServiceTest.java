import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

public class InvoiceServiceTest {

    private RideRepository rideRepository;
    private InvoiceService invoiceService;
    private String userId;

    @BeforeEach
    public void setUp() {
        rideRepository = new RideRepository();
        invoiceService = new InvoiceService(rideRepository);
        userId = "user123";

        Ride ride1 = new Ride(2.0, 5, Ride.RideType.NORMAL);
        Ride ride2 = new Ride(1.0, 2, Ride.RideType.PREMIUM);
        rideRepository.addRides(userId, Arrays.asList(ride1, ride2));
    }

    @Test
    public void testGenerateInvoice() {
        Invoice invoice = invoiceService.generateInvoice(userId);
        assertEquals(2, invoice.getTotalRides(), "Invoice total ride count is incorrect.");
        assertEquals(45, invoice.calculateTotalFair(), "Invoice total fare calculation is incorrect.");
        assertEquals(22.5, invoice.getAverageFare(), "Invoice average fare calculation is incorrect.");
    }
}
