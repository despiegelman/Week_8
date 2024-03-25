import java.util.*;
public class Factorial{
    public static void main(String[]args){
        int number;
        int sum = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();
        for(int a = 1; a <= number; a++)
        {
            sum *= a;
        }
        System.out.println(number + "! = " + sum);
    }
}