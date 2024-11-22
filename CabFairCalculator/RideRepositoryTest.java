import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class RideRepositoryTest {

    private RideRepository rideRepository;
    private String userId;

    @BeforeEach
    public void setUp() {
        rideRepository = new RideRepository();
        userId = "user123";
        Ride ride1 = new Ride(2.0, 5, Ride.RideType.NORMAL);
        Ride ride2 = new Ride(0.5, 2, Ride.RideType.PREMIUM);
        rideRepository.addRides(userId, Arrays.asList(ride1, ride2));
    }

    @Test
    public void testGetRides() {
        List<Ride> rides = rideRepository.getRides(userId);
        assertEquals(2, rides.size(), "Ride retrieval failed.");
    }

    @Test
    public void testEmptyRidesForNonExistentUser() {
        List<Ride> rides = rideRepository.getRides("unknownUser");
        assertTrue(rides.isEmpty(), "Expected empty list for non-existent user.");
    }
}
