import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        1.Write a program that checks the role of the user
//
        Scanner h=new Scanner(System.in);
        System.out.println("please enter you role");
        String role=h.nextLine();
        if (role.equalsIgnoreCase("admin")){
            System.out.println("welcom admain");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("welcom superuser");

        } else if (role.equalsIgnoreCase("user")) {
            System.out.println("welcom user");

        }else System.out.println("you should enter role");

//        2.Take three numbers from the user and print the greatest number.

        System.out.println("enter number :");
        int num1=h.nextInt();
        System.out.println("enter number 2:");
        int num2=h.nextInt();
        System.out.println("enter number 3");
        int num3=h.nextInt();
        if (num1 >= num2 && num1 >= num3){
            System.out.println( "the gretst number is "+num1);
        } else if (num2>=num1 && num2>=num3) {
            System.out.println("the gretest number is "+num2);

        } else {
            System.out.println("the gretest number is" +num3);}
//
////        3.Write a Java program that generates an integer between 1 and 7
////        and displays the name of the weekday.

        System.out.println("pleade enter  day number ");

        int number=h.nextInt();
        switch (number){
            case 1:
                System.out.println("sunday ");
                break;
            case 2:
                System.out.printf("monday " );
                break;
            case 3:
                System.out.println("teusday ");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.printf("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("saturday");
                break;

            default:
                System.out.println("number is rong");










//               4. Write a program that takes a numeric score as input and prints
//               the corresponding letter grade using the following grading scale:


                System.out.print(" enter the grade : ");
                double score = h.nextDouble();
                if (score >= 90 && score <= 100) {
                    System.out.println("you get A");
                } else if (score >= 80 && score < 90) {
                    System.out.println("you get  B");
                } else if (score >= 70 && score < 80) {
                    System.out.println("you get  C");
                } else if (score >= 60 && score < 70) {
                    System.out.println("you get D");
                } else if (score >= 0 && score < 60) {
                    System.out.println("you get F");
                } else {
                    System.out.println("not accsepted");
                }






//           5. Write a Java program that takes a person's age as input and
//           categorizes them into one of three age categories: "Child,"
//           "Teenager," or "Adult" using an if statement

                System.out.println("please enter your age ");
                int ag=h.nextInt();
                if (ag<13){
                    System.out.println("you are child");
                } else if (ag>=13 && ag<=19) {
                    System.out.println("you are teneger");

                } else {System.out.println("you are adult");

                }



        }}}