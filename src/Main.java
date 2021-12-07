public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        int term = 1;
        double payment = service.calculate(amount, term);
        System.out.println(payment);
    }
}