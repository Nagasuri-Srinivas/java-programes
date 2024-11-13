import java.util.Scanner;

class Largest
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) 
        {
            array[i] = sc.nextInt();
        }
        
    
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++) 
        {
            if (array[i] > firstLargest) 
            {
                secondLargest = firstLargest;
                firstLargest = array[i];
            } else if (array[i] > secondLargest && array[i] != firstLargest) 
            {
                secondLargest = array[i];
            }
        }
        
        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}
