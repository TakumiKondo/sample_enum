package sample_enum;

public class NormalAmount implements PayAmount {

    @Override
    public double getAmount() {
        double amount = 3;
        return amount;
    }

}
