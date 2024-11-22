import java.util.List;

public class InvoiceService {
    RideRepository repository;

    public InvoiceService(RideRepository repository){
        this.repository=repository;
    }

    public Invoice generateInvoice(String userId){
        List<Ride> rides=repository.getRides(userId);
        return new Invoice(rides);
    }

}
