public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double massKg = 98;
        double hightM = 1.87;

        double bmi = service.calculate(massKg, hightM);

        int index = (int)bmi;

        System.out.println("При росте " + hightM + " м");
        System.out.println("и весе " + massKg + " кг");
        System.out.println("Ваш индекс массы тела равен " + index);
    }
}