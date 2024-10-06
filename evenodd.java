import java.util.Scanner;

public class evenodd{
    public static void main (String[] args){
        int number,remainder;
        System.out.println("Please enter the numbere");
        Scanner scan = new Scanner(System.in);
        number=scan.nextInt();

        remainder=number % 2;

        if(remainder==0){
            System.out.println("the entered number is even");
        }
        else{
            System.out.println("the entered number is odd");
        }
    }
}