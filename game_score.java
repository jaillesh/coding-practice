import java.lang.System;
import java.util.Scanner;

class hello{
    public static void main(String[] args) {
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

