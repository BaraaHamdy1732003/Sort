import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class MyArray {
    private double[] a;
    public MyArray(){

    }
    public MyArray(int n){
        this.a = new double[n];
    }
    public MyArray(double[] a){
        this.a=Arrays.copyOf(a,a.length);
    }
    public void readArr(){
        Scanner scanner = new Scanner(System.in);
        System.out.print(" quantity of elements ");
        int n = scanner.nextInt();
        this.a =new double[n];
        for(int i=0; i<n; i++){
            this.a[i]= scanner.nextDouble();
        }
    }

    public void fillRandomArr(double left, double right){
        for(int i=0;i<this.a.length; i++){
            a[i]=Math.random()*(right-left)+left;
        }
    }
    public void newRandomArr(int n, double left , double right){
        this.a=new double[n];
        fillRandomArr(left,right);
    }
    @Override
    public String toString(){

        return "MyArray{"+ Arrays.toString(a)+"} ";
    }
    public double getElement(int i ){
        return this.a[i];
    }
    public void setElement(int i, double x){
        this.a[i]=x;
    }

    public double sum(){
        double s=0.0;
        for(int i=0; i<this.a.length;i++){
            s+= this.a[i];
        }
        return s;
    }
    public double maxElement(){
        double max= this.a[0];
        for(int i=1; i<this.a.length;i++){
            max= Math.max(max,this.a[i]);
        }
        return max;
    }
    public double minElementIndex(){
        int imin=0;
        for(int i=1; i<this.a.length;i++){
            if(this.a[i]< this.a[imin])
                imin = 1 ;
            // imin= this.a[i]< this.a[imin]?i:imin;
        }
        return imin;
    }
    public MyArray getPositiveElements(){
        int count =0;
        for (int i=0; i<this.a.length; i++){
            if(this.a[i]> 0)count++;
        }
        MyArray res= new MyArray(count);

        for(int i = 0,k = 0; i < this.a.length; k++) {
            if (this.a[k] > 0) {
                //res.setElement(i, this.a[k]);
                res.a[i] = this.a[k];
                i++;
            }
        }
        return  res;
    }
    public int indexOf(double key){
        for (int i =0; i< this.a.length;i++){
            if (this.a[i]==key)
                return i;
        }
        return -1;
    }
    public int binarySearch(double k){ //find index of an element by binary search
        double left = 0 , right = 0;
        while (left <= right){
            int middle = (int) (( left + right) / 2);
            if ( k == this.a[ middle]) return (int) middle;
            if ( k < this.a[ middle] ) right = middle -1;
            if ( this.a[ middle] > k ) left = middle + 1;
        }
        return -1;
    }



    public double[] getA() {
        return a;
    }

    public void setA(double[] a) {
        this.a = a;
    }
    void cocktailSort(int a[])
    {
        boolean swapped = true;
        int start = 0;
        int end = a.length;

        while (swapped == true)
        {
            // reset the swapped flag on entering the
            // loop, because it might be true from a
            // previous iteration.
            swapped = false;

            // loop from bottom to top same as
            // the bubble sort
            for (int i = start; i < end - 1; ++i)
            {
                if (a[i] > a[i + 1]) {
                    int temp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = temp;
                    swapped = true;
                }
            }

            // if nothing moved, then array is sorted.
            if (swapped == false)
                break;

            // otherwise, reset the swapped flag so that it
            // can be used in the next stage
            swapped = false;

            // move the end point back by one, because
            // item at the end is in its rightful spot
            end = end - 1;

            // from top to bottom, doing the
            // same comparison as in the previous stage
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

            // increase the starting point, because
            // the last stage would have moved the next
            // smallest number to its rightful spot.
            start = start + 1;
        }
    }

    /* Prints the array */
    void printArray(int a[])
    {
        int n = a.length;
        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }

    // Driver code



}
