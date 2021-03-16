
import java.util.Scanner;

public class Functions {

    public static double calcTotalPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip=tipRate*listedMealPrice;
        double tax=taxRate*listedMealPrice;
        double result=listedMealPrice+tip+tax;
        return result;
    }

    public static void main(String[] args) {
        calcTotalPrice(15, .2, .08);
        calcTotalPrice(25, .18, .08);


    }
}
