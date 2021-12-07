import java.time.Period;

public class CreditPaymentService {
    public double calculate(int amount, int tern) {
        int month = 12;
        double yearPercent = 9.9;
        double monthPercent = yearPercent / 100 / 12;
        int period = tern * month;
        double pow = Math.pow(1 + monthPercent, period);
        double costCredit = (period * amount * monthPercent * pow) / (pow - 1);
        double payment = costCredit / period;
        return payment;
    }
}
