//Write a program to display the places of digits for 5132

public class Place_Value_Prob {
    public static void main(String args[])
    {
        int x=5132,thousands,hundreds,tens,ones;

        thousands =  x / 1000;
        System.out.printf("thousands place digit: "+(thousands)*1000);

        hundreds =  (x-thousands) / 100;
        System.out.printf("\nHundreds place digit: "+(hundreds)*100);

        tens = (x - hundreds) / 10;
        System.out.printf("\nTens place digit: "+(tens)*10);

        ones = (x - hundreds - tens);
        System.out.printf("\nOnes place digit: "+(ones)*1);

    }
}
