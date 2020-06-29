public class Ternary{
    public static void main(String a[])
    {
        int i=1;
        int j=5;

        j= i==1?6:7;
        System.out.println(j);


       object obj1;
       object obj2;

       if(true)
       {
           obj1 = new Integer(10);
       }
       else
       {
           obj1 = new Double(15.0);
       }
       System.out.println(obj1);

       obj2 = true?new Integer(10):new Double(15.0);
       System.out.println(obj2);
    }
}