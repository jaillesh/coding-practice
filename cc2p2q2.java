import java.util.Scanner;

class hello{
public static void main(String[] args) {
@SuppressWarnings("resource")
Scanner scan = new Scanner(System.in);
int Tam = scan.nextInt();
int Eng = scan.nextInt();
int Mat = scan.nextInt();
int Sci = scan.nextInt();
int Soc = scan.nextInt();
int total = Tam+Eng+Mat+Sci+Soc;
int avg = total/5;
System.out.println("The total marks obtained is " + total);
System.out.println("The average of the total marks obtained is " + avg);
if(avg<35){
System.out.println("Additional class is required");
}
else{
System.out.println("You are good to go");
}
}
}

