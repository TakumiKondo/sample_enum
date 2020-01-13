package sample_enum;

public class RetiredAmount implements PayAmount {

    @Override
    public double getAmount() {
        double amount = 2;
        return amount;
    }

}
