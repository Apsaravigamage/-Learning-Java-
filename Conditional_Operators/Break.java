public class Break{
    public static void main(String a[])
    {
        //break switch loop
        navin:// label
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==3)
                    break navin;// labeled break statement
                System.out.print("*");
            }
            System.out.print("");
        }
    }
}