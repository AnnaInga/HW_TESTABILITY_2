public class BmiService {
    public double calculate(double massKg, double hightM) {
        double bmi = massKg / Math.pow(hightM, 2);

        return bmi;

    }
}
