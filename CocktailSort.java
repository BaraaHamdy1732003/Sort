import java.util.ArrayList;
import java.util.Arrays;

public class CocktailSort{

    void cocktailSort(int a[]) {

        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped == true)
        {
            swapped = false;
            for (int i = start; i < end - 1; ++i)
            {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
            swapped = false;
            end = end - 1;
            for (int i = end - 1; i >= start; i--)
            {
                if (a[i] > a[i + 1])
                {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }
            start = start + 1;
        }
    }
    void printArray(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    public static void main(String[] args)
    {
        ArrayList<String>  SortOfNum=new ArrayList<>();
        SortOfNum.add("0");
        SortOfNum.add("4");
        SortOfNum.add("3");
        SortOfNum.add("2");
        SortOfNum.add("1");
        SortOfNum.add("6");
        SortOfNum.add("12");
        SortOfNum.add("50 ");
        System.out.println ("First = "+SortOfNum);

        ArrayList<String>  SortOfNum1=new ArrayList<>();

        SortOfNum1.add(" 0");
        SortOfNum1.add("1");
        SortOfNum1.add("4");
        SortOfNum1.add("3");
       SortOfNum1.add("2");
        SortOfNum1.add("6");
        SortOfNum1.add("12");
        SortOfNum1.add("50 ");
        System.out.println ("2ND = "+SortOfNum1);

        ArrayList<String>  SortOfNum2=new ArrayList<>();

       SortOfNum2.add(" 0");
        SortOfNum2.add("1");
        SortOfNum2.add("2");
       SortOfNum2.add("4");
        SortOfNum2.add("3");
        SortOfNum2.add("6");
        SortOfNum2.add("12");
        SortOfNum2.add("50 ");
        System.out.println ("3TH = "+SortOfNum2);

        ArrayList<String>  SortOfNum3=new ArrayList<>();

        SortOfNum3.add("0");
        SortOfNum3.add("1");
        SortOfNum3.add("2");
        SortOfNum3.add("3");
        SortOfNum3.add("4");
        SortOfNum3.add("6");
        SortOfNum3.add("12");
        SortOfNum3.add("50");
        System.out.println ("4TH = "+SortOfNum3);


        CocktailSort ob = new CocktailSort();
        int a[] = { 0,4,50,3,2,1,6,12 };
        ob.cocktailSort(a);
        System.out.print  ( "Cocktail Sort = " );
        ob.printArray(a);
    }
}
