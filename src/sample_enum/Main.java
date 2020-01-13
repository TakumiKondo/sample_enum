package sample_enum;

public class Main {
    public static void main(String... args) {

        // ■書き方色々
        // ①Enum値を直接指定して取得
        PaymentType dead = PaymentType.dead;
        System.out.println("Dead amount: " + dead.getAmount());

        // ②valueOfで名称を指定して取得
        PaymentType retired = PaymentType.valueOf("retired");
        System.out.println("Retired amount: " + retired.getAmount());

        // ③変数に格納せずに直接使う
        System.out.println("Normal amount: " + PaymentType.normal.getAmount());

    }
}
