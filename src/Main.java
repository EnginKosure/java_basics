import java.util.Locale;
import java.util.Scanner;

public class Main {

//    public static void main(String[] args) {
//        double studentGPA = 3.45;
//        String studentFirstName = "Kayla";
//        String studentLastName = "Hammon";
//        System.out.println(studentFirstName + " " +
//                studentLastName + " has a GPA of " + studentGPA);
//        System.out.println("What do you want to update it to?");
//
//        Scanner input = new Scanner(System.in);
//        studentGPA = input.nextDouble();
//
//        System.out.println(studentFirstName + " " + studentLastName +
//                " now has a GPA of " + studentGPA);
//
//        System.out.println("Pick a number between 1 and 10");
//        Scanner scanner=new Scanner(System.in);
//
//        int inputtedNum=scanner.nextInt();
//
//        if (inputtedNum<5){
//            System.out.println("Enjoy the good luck");
//        } else{
//            System.out.println("Always good luck");
//        }
//
//        boolean isOnRepeat=true;
//        while(isOnRepeat){
//            System.out.println("Playing current song");
//            System.out.println("Turn of repeat? If so, answer yes");
//            String userInput=input.next();
//
//            if(userInput.equals("yes")){
//                isOnRepeat=false;
//            }
//        }
//        System.out.println("Playing next");
//
//        String question ="What is the next planet in orbit towards sun?";
//        String choiceOne="venus";
//        String choiceTwo="mars";
//        String choiceThree="uranus";
//
//        String correctAnswer=choiceTwo;
//
//        System.out.println(question);
//        System.out.println("choices: A:"+ choiceOne+ " B:"+ choiceTwo + " C:"+choiceThree);
//        Scanner quiz=new Scanner(System.in);
//
//        String userAnswer=quiz.next();
//
//        if(correctAnswer.equals(userAnswer.toLowerCase())){
//            System.out.println("Congrats!");
//        }else{
//            System.out.println("Sorry, incorrect. Correct answer is "+correctAnswer );
//        }
//    }

    public static  void  main(String[] args){
        Triangle triangleA=new Triangle(15, 8, 15, 8, 17 );
        Triangle triangleB=new Triangle(3,2.598, 3,3,3);

        double triangleAArea=triangleA.findArea();
        System.out.println(triangleAArea);

    }

}

