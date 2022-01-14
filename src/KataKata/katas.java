package KataKata;

import java.util.Collections;

public class katas {
//   public static char calculategradeFor(int score) {...}
    
    public static int calculateMinimunof(int[] numbers) {
        int minimumNumber = 0;
                for(int number: numbers){
                    for(int i = 0; i < numbers.length; i++){
                        Math math = null;
                        minimumNumber = math.min(minimumNumber, numbers[i]);
                    }
                }
                return minimumNumber;
    }
    

 
       public static double calculateAverageOf(int[] numbers){
    double average = 0.0;
           int total = 0;
//          for(int number: numbers){
//                total += number;
            
            
            for(int i = 0; i < numbers.length; i++)

    {
        total += numbers[i];
    }
                    average = total / (double)numbers.length;
            return average;
    
}
}