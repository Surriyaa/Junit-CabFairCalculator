import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RideRepository {
    private Map<String, List<Ride>> userRides = new HashMap<>();

    public void addRides(String userId, List<Ride> rides) {
        userRides.put(userId, rides);
    }

    public List<Ride> getRides(String userId) {
        return userRides.getOrDefault(userId, new ArrayList<>());
    }
}
