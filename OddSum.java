import java.util.*;
public class OddSum {
    public static void main(String[]args){
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();
        for(int a = 1; a <= number; a += 2)
        {
            sum += a;
        }
        System.out.println("The sum of the odd numbers from 1 - " + number + " is " + sum);
    }
}
