import java.util.Scanner;
class hello{
    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        @SuppressWarnings("resource")
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