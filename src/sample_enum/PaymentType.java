package sample_enum;

public enum PaymentType {

    dead(new DeadAmount()),
    retired(new RetiredAmount()),
    normal(new NormalAmount());

    private PayAmount payAmount;

    private PaymentType(PayAmount payAmount) {
        this.payAmount = payAmount;
    }

    public double getAmount() {
        return payAmount.getAmount();
    }

}
