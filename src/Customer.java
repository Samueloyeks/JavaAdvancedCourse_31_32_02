import enums.Gender;

import java.util.Date;
import java.util.List;

public class Customer extends User{
    private Integer customerId;
    private Double balance;
    private Boolean active;

    List<Seller> sellers;

    public void topUp(Double topUpAmount){
        balance += topUpAmount;
    }

    public Double getBalance() {
        return balance;
    }

    public void buy(Integer sellerId, Integer computerId){
        Seller relevantSeller = null;

        for(Seller seller: sellers){
            if(sellerId.equals(seller.getSellerId())){
                relevantSeller = seller;
            }
        }

        Computer relevantComputer = null;

        for(Computer computer: relevantSeller.availableComputers){
            if(computerId.equals(computer.getId())){
                relevantComputer = computer;
            }
        }

        if(relevantComputer.getPrice() > balance){
            System.out.println("Sorry you do not have enough money");
            return;
        }


    }
    public Customer(String fullName,
                    Date dob,
                    Gender gender,
                    List<Seller> sellers
                    ){
        super(fullName, dob, gender);
        customerId = generateId();
        balance = 0.0;
        active = true;
        this.sellers = sellers;
    }
}
