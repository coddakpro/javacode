package ChapterSeven;

public class ArrayMe {
    public static int[] Array;

    static {


        int[] myIntArray = new int[10];
        for (int i = 0; i < 10; i++) {
            myIntArray[i] = i * 10;
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray[i]);
        }
    }

    public static void main(String[] args) {

    }

}
