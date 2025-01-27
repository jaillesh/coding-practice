import java.util.Scanner;

class hello{
    public static void main(String args[])
    {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a>35) {
            System.out.println("Pass");
        }
        else{
            System.out.println("Fail");
        }
    }
}