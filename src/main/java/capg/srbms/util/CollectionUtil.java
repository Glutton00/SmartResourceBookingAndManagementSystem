package capg.srbms.util;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import capg.srbms.dto.*;

public class CollectionUtil {
	
	public static Map<String, Cart> cartRepo = new HashMap<>();
    public static Map<String, Booking> bookingRepo = new HashMap<>();
    public static List<User> userRepo = new ArrayList<>();
    public static List<Resource> resourceRepo = new ArrayList<>();

    static {

        resourceRepo.add(new Resource("R001", "Conference Room A", "Room", 100.0, true));
        resourceRepo.add(new Resource("R002", "Meeting Room B", "Room", 80.0, true));

        resourceRepo.add(new Resource("E001", "Projector", "Equipment", 50.0, true));
        resourceRepo.add(new Resource("E002", "Laptop", "Equipment", 75.0, true));

        resourceRepo.add(new Resource("B001", "Java Programming", "Book", 30.0, true));
        resourceRepo.add(new Resource("B002", "Design Patterns", "Book", 40.0, true));

        resourceRepo.add(new Resource("M001", "Guitar", "Musical Instrument", 60.0, true));
        resourceRepo.add(new Resource("M002", "Keyboard", "Musical Instrument", 70.0, true));
    }

}
