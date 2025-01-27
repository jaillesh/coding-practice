import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            int a = scan.nextInt();
            //% - modulas
            if(a%2==0){
                System.out.println("The given number is a Even Number");
            }else if(a%2==1){
                System.out.println("The given number is a Odd Number");
            }   }
}
}