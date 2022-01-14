package ChapterSeven;

import chapterSix.Katas;
import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayFunctionTest {

    private int maxOneLessNumber;
    private int minOneLessNumber;


    @Test
    public void arrayFindTheMaximumLessOneTest() {
        int[] numbers = {12, 11, 13, 10, 14};
        int result = 13;
        assertEquals(13, "");
    }

    @Test
    public void arrayFindTheMinimumLessOneTest() {
        int[] numbers = {12, 11, 13, 10, 14};
        int result = 0;
        assertEquals(0,
                "");
    }

    @org.junit.jupiter.api.Test

    public void arrayMinimumCanBeCalculatedTest(){
        int [] numbers = {1,2,3,4,5};
        int result = Katas.calculateMinimumOf(numbers);
        assertEquals(14, result);
    }

    @org.junit.jupiter.api.Test

    public  void arrayMaximumCanBeCalculatedTest(){
        Katas kata = new Katas();
        int[] numbers = {1,2,3,4,5};
        int result = 0;
        assertEquals(10, result);
    }

}