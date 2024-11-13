import java.util.Scanner;
class Negative
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("Negative numbers in the array are: ");
        for (int number : numbers) 
        {
            if (number < 0) 
             {
                System.out.print(number + " ");
            }
        }
    }
}
