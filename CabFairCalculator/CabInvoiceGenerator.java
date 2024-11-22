
import java.util.Arrays;
public class CabInvoiceGenerator {
    public static void main(String[] args) {
        
    RideRepository repository=new RideRepository();
    InvoiceService invoiceService=new InvoiceService(repository);

    // Adding some rides for a user
    Ride ride1 = new Ride(2.0, 5, Ride.RideType.NORMAL);
    Ride ride2 = new Ride(10.1, 10, Ride.RideType.PREMIUM);
    Ride ride3 = new Ride(5.0, 20, Ride.RideType.NORMAL);

    String userId="user143";
    repository.addRides(userId, Arrays.asList(ride1, ride2, ride3));
        // Generate and print the invoice
    Invoice invoice=invoiceService.generateInvoice(userId);
    invoice.printInvoice();
    }
}
