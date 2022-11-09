import enums.Gender;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class Seller extends User{
    private Integer sellerId;
    private Double revenue;
    private Boolean active;

    public Integer getSellerId() {
        return sellerId;
    }

    public List<Computer> availableComputers = Arrays.asList(
            new Computer(24.5),
            new Computer(17.0),
            new Computer(30.0)
    );

    public Seller(String fullName, Date dob, Gender gender){
        super(fullName, dob, gender);
        sellerId = generateId();
        revenue = 0.0;
        active = true;
    }

}
