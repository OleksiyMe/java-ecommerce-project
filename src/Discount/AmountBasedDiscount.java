package Discount;

import java.util.UUID;

public class AmountBasedDiscount extends Discount{

    private Double discountAmmount;

    public AmountBasedDiscount(UUID id, String name, Double thresholdAmount, Double discountAmmount) {
        super(id, name, thresholdAmount);
        this.discountAmmount = discountAmmount;
    }

    public Double getDiscountAmmount() {
        return discountAmmount;
    }

    @Override
    public Double calculateCartAmmountAfterDiscountApplied(Double ammount) {
        return null;
    }
}
