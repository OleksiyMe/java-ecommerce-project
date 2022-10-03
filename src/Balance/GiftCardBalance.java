package Balance;

import java.util.UUID;

public class GiftCardBalance extends Balance {
    public GiftCardBalance(UUID customerId, Double balance) {
        super(customerId, balance);
    }

    @Override
    public Double addBalance(Double additionalBalance) {
        double promotionalAmmount= additionalBalance *10/100;


        setBalance(getBalance() + additionalBalance +promotionalAmmount);
        return getBalance();
    }
}
