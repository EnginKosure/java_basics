
import java.util.Scanner;

public class Functions {

    public static double calcTotalPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip=tipRate*listedMealPrice;
        double tax=taxRate*listedMealPrice;
        return listedMealPrice+tip+tax;
    }

    public static void main(String[] args) {
        double groupTotalPrice=calcTotalPrice(100, .2, .08);
        System.out.println(groupTotalPrice);

        double individualPrice=groupTotalPrice/5;
        System.out.println(individualPrice);

    }
}
