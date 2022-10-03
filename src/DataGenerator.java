import Balance.Balance;
import Balance.CustomerBalance;
import Balance.GiftCardBalance;
import Discount.AmountBasedDiscount;
import Discount.Discount;
import Discount.RateBasedDiscount;
import category.Category;
import category.Electronic;
import category.Furniture;
import category.SkinCare;

import java.util.*;

public class DataGenerator {
    //Creating a sample class
    public static void createCustomer() {
        Address address1Customer1 = new Address("7925", "Jones Branch Drive", "Suit 3300", "22102", "Virginia");
        Address address2Customer1 = new Address("825", "Georgetown Parkway", "Suit 5355", "22036", "Virginia");
        Address address1Customer2 = new Address("5924", "Lee Hwy", "House", "22044", "Virginia");

        List<Address> customer1AddressList = new ArrayList<>(Arrays.asList(address2Customer1, address1Customer1));
        Customer customer1 = new Customer(UUID.randomUUID(), "ozzy", "ozzy@cydeo.com", customer1AddressList);
        Customer customer2 = new Customer(UUID.randomUUID(), "mike", "mike@gmail.com");

        StaticConstants.CUSTOMER_LIST.add(customer1);
        StaticConstants.CUSTOMER_LIST.add(customer2);


    }

    public static void createCategory() {
        Category category1 = new Electronic(UUID.randomUUID(), "Electronic");
        Category category2 = new Furniture(UUID.randomUUID(), "Furniture");
        Category category3 = new SkinCare(UUID.randomUUID(), "SkinCare");
        StaticConstants.CATEGORY_LIST.add(category1);
        StaticConstants.CATEGORY_LIST.add(category2);
        StaticConstants.CATEGORY_LIST.add(category3);


    }

    public static void createProduct() {
        Product product1 = new Product(UUID.randomUUID(), "PS5", 230.72,
                7, 7, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product2 = new Product(UUID.randomUUID(), "XBOX", 120.45,
                7, 7, StaticConstants.CATEGORY_LIST.get(0).getId());
        Product product3 = new Product(UUID.randomUUID(), "Chair", 12.34,
                85, 85, StaticConstants.CATEGORY_LIST.get(1).getId());
        Product product4 = new Product(UUID.randomUUID(), "Milk", 20.34,
                89, 89, UUID.randomUUID());

//StaticConstants.CATEGORY_LIST.get(2).getId()

        StaticConstants.PRODUCT_LIST.add(product1);
        StaticConstants.PRODUCT_LIST.add(product2);
        StaticConstants.PRODUCT_LIST.add(product3);
        StaticConstants.PRODUCT_LIST.add(product4);
    }

    public static void createBalance() {

        Balance customerBalance=new CustomerBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 450.0);

        Balance giftCardBalance=new GiftCardBalance(StaticConstants.CUSTOMER_LIST.get(0).getId(), 500.0);

        StaticConstants.CUSTOMER_BALANCE_LIST.add(customerBalance);
        StaticConstants.GIFT_CARD_BALANCE_LIST.add(giftCardBalance);

    }


    public static void createDiscount(){



        Discount amountBasedDiscount=new AmountBasedDiscount(UUID.randomUUID(),  "Buy 250 Free 50",
                250.00, 500.0);

        Discount rateBasedDiscount=new RateBasedDiscount(UUID.randomUUID(),
                "Buy 500, free %15", 500.00, 15.00);

        StaticConstants.DISCOUNT_LIST.add(amountBasedDiscount);
        StaticConstants.DISCOUNT_LIST.add(rateBasedDiscount);


    }

}
