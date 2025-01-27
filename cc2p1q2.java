import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int income = scan.nextInt();
        if(income>7000){
            System.out.println("Scholarship is Available");
        }
        else{
            System.out.println("Scholarship is Not Available");
        }
    }
}