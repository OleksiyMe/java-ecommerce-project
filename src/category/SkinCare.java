package category;

import java.rmi.server.UID;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class SkinCare extends Category{
    public SkinCare(UUID id, String name) {
        super(id, name);
    }

    public LocalDateTime findDeliveryDueDate() {

        return LocalDateTime.now();
    }


}
