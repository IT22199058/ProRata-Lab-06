import java.util.Scanner;

public class IT22199058Lab6Q2C {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Please enter 10 numbers:");

        int i = 0;
        while (i < 10) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
            i++;
        }

        System.out.println();
        System.out.println("The numbers you entered are:");

        int sum = 0;
        i = 0;
        while (i < 10) {
            System.out.print(numbers[i]);
            if (i < 9) {
                System.out.print(" ");
            }
            sum += numbers[i];
            i++;
        }
        System.out.println();

        double average = sum / 10.0;

        System.out.println();
        System.out.println("Sum of the numbers: " + sum);
        System.out.println("Average of the numbers: " + average);

        input.close();
    }
}