import java.lang.System;
import java.util.Scanner;

class hello{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String color = scan.nextLine();
        //String color = "red";
        //String color = new String();
        if(color.equals("red")){
            System.out.println("Stop");
        }
        else if(color.equals("yellow")){
            System.out.println("Get Ready");
        }
        else if(color.equals("green")){
            System.out.println("Go");
        }
        else{
            System.out.println("Enter a proper color of the Traffic light");
        }
    }
}

//Remove the indents from the git repo
