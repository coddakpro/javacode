package chapterSix;

public class ArrayLay {
    public static void main(String[] args) {

        int[] myIntArray = new int [10];
//        int [] myIntArray  = {1,2,3,4,5,6,7,8,9,10};
        myIntArray[5] = 50;
//        int [] myIntArray = new int[25];
//        double[] myDoubleArray = new double[0];
        for (int i = 0; i< myIntArray.length; i++){
            myIntArray[i] = i*10;
        }
        for (int i=0; i< myIntArray.length; i++){
            System.out.println(" Element " +  i  + ", value is " + myIntArray[i]);
        }
    }
}
