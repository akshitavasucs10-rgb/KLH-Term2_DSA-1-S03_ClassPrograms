import java.util.Scanner;

public class EvenOddArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

    
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        int even = 0;
        int odd = 0;

    
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        for (int i = 0; i < n; i++) {

            if (arr[i] % 2 == 0) {
                even++;
            } 
            else {
                odd++;
            }
        }

    
        System.out.println("Even numbers count = " + even);
        System.out.println("Odd numbers count = " + odd);

        sc.close();
    }
}