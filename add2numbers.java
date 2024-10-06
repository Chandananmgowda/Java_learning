import java.util.Scanner;

public class add2numbers {
    public static void main(String[] args) {
        int num1,num2,result;
       
        Scanner add = new Scanner(System.in);
        System.out.println("enter the  first numbers ");
        num1=add.nextInt();
        System.out.println("enter the second  numbers ");
        num2=add.nextInt();
        add.close();
        
      
        
        result = num1 + num2;

        System.out.printf( "%d+%d=%d ",num1,num2,result);
    }
}
