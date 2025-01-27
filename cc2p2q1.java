//get input for five subjects marks. Add all of it, And find average. If average mark is less than 35. 
//Print "Additional class is required" else Print "you are good to go"

import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
        if(score<50){
            System.out.println("You need to improve");
        }
        else if(score>=50 && score<=70){
            System.out.println("Good Job");
        }
        else {
            System.out.println("Excellent Performance");
        }        
    }
}