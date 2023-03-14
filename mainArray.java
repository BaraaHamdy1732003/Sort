public class mainArray {
    public static void main(String[] args) {

     /*   MyArray array = new MyArray();
        System.out.println(array);//It'd print zero
        array.readArr();
        System.out.println(array);
        System.out.println("The sum of elements in first array = " + array.sum());
        System.out.println("The index of the minimum number = " + array.minElementIndex());
        System.out.println("The positive elements array");
        System.out.println(array.getPositiveElements());

        System.out.println("**************************************************************");


        MyArray arr1 = new MyArray(5);
        arr1.fillRandomArr(0,5);
        System.out.println(arr1);
        System.out.println();
        System.out.println("Checking index");
        System.out.println(arr1.binarySearch(5));*/

            CocktailSort ob = new CocktailSort();
            int a[] = { 5, 1, 4, 2, 8, 0, 2 };
            ob.cocktailSort(a);
            System.out.println("Sorted array");
            ob.printArray(a);
        }
    }
