
import java.util.Scanner;

//Get inuput for variable a and b and print the number from a to b 
//input: 5 10 output: 5 6 7 8 9 10

class hello {

    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in))
        {
            int i;
            System.out.println("Enter a: ");
            int a = scan.nextInt();
            System.out.println("Enter b: ");
            int b = scan.nextInt();
            for(i=a;i<=b;i=i+1)
            {
                System.out.println(i);
            }
        }
        

    }
}