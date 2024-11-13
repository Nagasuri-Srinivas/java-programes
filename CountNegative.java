import java.util.Scanner;

 class CountNegative
 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int sz = sc.nextInt();
        int[] array = new int[sz];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sz; i++) {
            array[i] = sc.nextInt();
        }

        int negativeCount = 0;
        for (int i = 0; i < sz; i++) {
            if (array[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Total number of negative numbers: " + negativeCount);
    }
}
