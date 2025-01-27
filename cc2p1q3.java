import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if(a%3==0 && a%5==0){
            System.out.println("Divisible by both 3 & 5");
        }
        else if(a%3==0){
            System.out.println("Divisible only by 3");
        }
        else if(a%5==0){
            System.out.println("Divisible only by 5");
        }
        else{
            System.out.println("Not Divisible either by 3 nor 5");
        }
        
    }
}