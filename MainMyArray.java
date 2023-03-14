public class MainMyArray {
    public static void main(String[] args) {
        MyArray x = new MyArray();
        x.readArr();
        System.out.println(x);
        MyArray y = new MyArray(6);
        y.fillRandomArr(-10.0, 10.0);
        System.out.println(y);

        MyArray z = new MyArray(new double[]{3.1415, 7.5, 109.86});
        System.out.println(z);
        System.out.println("[2] " + z.getElement(2));
        System.out.println("sum = " + z.sum());

        MyArray w = new MyArray();
        w.newRandomArr(20, -100.0, 101.0);
        System.out.println(w);

        System.out.println("max = " + w.maxElement());
        System.out.println("index of min = " + w.minElementIndex());
        MyArray p = w.getPositiveElements();
        System.out.println(p);
    }
}