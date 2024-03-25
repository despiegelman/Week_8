import java.util.*;
public class OddSum2 {
    public static void main(String[]args){
        int number;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        input.close();
        int power = (number/2)+1;
        sum = power * power;
        System.out.println("The sum of the odd numbers from 1 - " + number + " is " + sum);
    }
}
