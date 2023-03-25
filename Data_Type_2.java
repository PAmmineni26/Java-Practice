public class Data_Type_2 {
    public static void main(String args[])
    {
        char ch='A';
        int a=15;
        float x=12.45f;
        double p=16.75;
        long d= 15323;

        a=ch; // Explicit Conversion
        System.out.println("A Value is "+a);
        x=a; // Explicit Conversion
        System.out.println("X value is: "+x);
        p=x; // Explicit Conversion
        System.out.println("P Value is: "+p);
        d=(long)p;
        System.out.println("D Value is "+d);



    }
}
