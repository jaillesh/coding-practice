// array 
// Get input for 5 numbers using Array and for loop
import java.util.Scanner;

class hello {
    public static void main(String[] args) {
        int[] number = new int[5];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<=4;i=i+1)
        {
            number[i] = scan.nextInt();
        }
        System.out.println(number[0]);

    }
        
    } 