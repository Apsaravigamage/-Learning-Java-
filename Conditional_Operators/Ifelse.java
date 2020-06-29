public class Ifelse{
    public static void main(String a[])
    {
        int num1 = 8;

        if(num1 % 2==0)
        {
             System.out.println("Even");
        }
        else
        {
             System.out.println("Odd");
        }

        int x,y,z;
        x=4;
        y=6;
        z=8;

        if(x>y && x>z)
        {
            System.out.println("X");
        }
        else if(y>z)
        {
            System.out.println("Y");
        }
        else
        {
            System.out.println("Z");
        }
    }
}