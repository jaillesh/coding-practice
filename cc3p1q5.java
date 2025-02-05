// Print the number which are divisible by both 3 and 5, Range 1 to 100 -- for loop concept
class hello{
    public static void main(String[] args) {
        int i;
        for(i=1;i<=100;i=i+1)
        {
            if(i%3==0 && i%5==0)
            {
                System.out.println(i);
            }
        }
    }
}