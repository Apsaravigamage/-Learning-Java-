public class Perfect{
    public static void main(String a[])
    {
        int n =28;
        boolean b = isPerfect(n);
        if(b)
            System.out.println("It's a perfect num");
        else
            System.out.println("It's not");
    }
    public static boolean isPerfect(int n)
    {
        int sum = 0;

        for(int i=1; i<n; i++)
        {
            if(n%i==0)
                sum = sum + i;      
        }

        if (n==sum)
            return true;
        
        return false;
    }

        
    
}