public class Fibonacci{
    public static void main(String a[])
    {
        // 1 1 2 3 5 8 13 21....n
        int k, c=1,b=1;
        k=0;

        System.out.print("1 1 ");

        while (k<=50)
        {
            k=c+b;
            System.out.print(k + " ");
            c=b;
            b=k;
        }

    }

        
    
}