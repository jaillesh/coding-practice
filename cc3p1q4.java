class hello{
    public static void main (String[]args){
       // Scanner scan = new Scanner(System.in);
            int i;
            int evencount = 0;
            int oddcount = 0;
            /*int a = scan.nextInt();
            int b = scan.nextInt();*/
        for(i=1;i<=50;i=i+1)
        {
            if(i%2==0){
               
                evencount = evencount+1;
                System.out.println("E: "+i);
            }          
        }
            System.out.println("E-Count: " +evencount);
        for(i=1;i<=50;i=i+1)
        {
                if(i%2!=0){ 
                    oddcount = oddcount+1;
                    System.out.println("O: "+i);
                    
                }      
        }
            System.out.println("O-Count: " +oddcount); 
        }
        
    }