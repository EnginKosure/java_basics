
import java.util.Scanner;

public class Functions {

    public static void calcTotalPrice(double listedMealPrice, double tipRate, double taxRate){
        double tip=tipRate*listedMealPrice;
        double tax=taxRate*listedMealPrice;
        double result=listedMealPrice+tip+tax;
        System.out.println("Your total meal price is "+result);
    }

    public static void main(String[] args) {
        calcTotalPrice(15, .2, .08);
        calcTotalPrice(25, .18, .08);


    }
}
// Java code must be compiled before run
//  Source code => compiles to Byte code
// javac Hw.java   --> run that command to compile -->Hw.class file will be generated
// Now we can run our program
// Write the name of the class without the extension
// java Hw