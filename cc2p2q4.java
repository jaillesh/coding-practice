import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to HDFC Bank!");
        System.out.println("Enter your Salary");
        int salary = scan.nextInt();
        System.out.println("Enter your Age");
        int age = scan.nextInt();
        
        if(salary>=20000 || age<=25){
            System.out.println("Excellent! Your meeting the required creteria and your eligible for loan amount");
            System.out.println("Enter your required Loan Amount");
            int loan = scan.nextInt();
            if(loan<=50000)
            {
                System.out.println("You'll get your loan amount " + loan + " within 10 minutes");
            }
            else
            {
                System.out.println(" Maximum Loan amount is 50,000, please enter within this maximum limit ");
            }
        }
            else{
                System.out.println("Your salary or age limit doesn't meet our requirements for providing the loan to you. Sorry, See u later!");
            }
        
    }
}