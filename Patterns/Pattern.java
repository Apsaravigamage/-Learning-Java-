public class Pattern{
    public static void main(String a[]){
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int x=1;x<=4;x++)
        {
            for(int y=1;y<=x;y++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int p=1;p<=4;p++)
        {
            for(int q=1;q<=4;q++)
            {
                if(p==1||p==4||q==1||q==4)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }System.out.println();
        }
    }
}