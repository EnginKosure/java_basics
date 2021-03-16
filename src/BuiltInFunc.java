public class BuiltInFunc {
    public static double salaryCalc(double hoursPerWeek, double amountPerHour){
        double weeklyPaycheck=hoursPerWeek*amountPerHour;
        return weeklyPaycheck*52;
    }

    public static void main(String[] args) {
        double result=Math.pow(2,5);
        System.out.println(result);

        double salary=salaryCalc(40,15);
        System.out.println(salary);
    }
}
