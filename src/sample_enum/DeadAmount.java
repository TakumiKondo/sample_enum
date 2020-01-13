package sample_enum;

public class DeadAmount implements PayAmount {

    @Override
    public double getAmount() {
        double amount = 1;
        return amount;
    }

}
