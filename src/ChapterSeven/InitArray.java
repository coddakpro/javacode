package ChapterSeven;

public class InitArray {
    public static void main(String[] args) {

        int[] array = new int[10];

        System.out.printf("%s%s%n", "Index", "value");

        for (int counter = 0; counter < array.length; counter++)
            System.out.printf("%d%d%n", counter, array[counter]);
    }

}
