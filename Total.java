
import java.util.Scanner;
 class Total
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int size = sc.nextInt();
        
        int[] array = new int[size];
        
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) 
        {
            array[i] = sc.nextInt();
        }
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (int i = 0; i < size; i++)
        {
            if (array[i] % 2 == 0) 
            {
                evenCount++;
            } else 
            {
                oddCount++;
            }
        }
        
        
        System.out.println("Total number of even elements: " + evenCount);
        System.out.println("Total number of odd elements: " + oddCount);
        
    }
}
