//Write a program to interchange the value of two variables with using third variable
public class Swapping_1
{
    public static void main(String args[])
    {
        int x,a=4,b=5;
        System.out.println("Enter Values of a,b: ");
        System.out.println("a="+a+" b="+b);
        System.out.println("Numbers after Interchanging:");
        x=a;
        a=b;
        b=x;
        System.out.println("a="+a+" b="+ b);
    }
}