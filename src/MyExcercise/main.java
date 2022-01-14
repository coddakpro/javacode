package MyExcercise;

public class main {
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 700;
        int levelCompleted = 8;
         int  bonus = 100;

         calculateScore(true, 800, 5, 100 );

         calculateScore(true, 10000, 8, 200);

//          if (gameOver) {
//              int finalscore = score + (levelCompleted * bonus);
//              finalscore += 1000;
//              System.out.println("your score was " + finalscore);
//          }
//
          score = 10000;
          levelCompleted = 8;
          bonus = 200;

           if (gameOver){
               int finalscore = score + (levelCompleted * bonus);
               System.out.println("your finalScore was " + finalscore);

           }
    }
    public static void calculateScore(boolean gameOver, int score, int levelconmpleted, int bonus){

        if (gameOver) {
            int finalscore = score + (levelconmpleted * bonus);
            finalscore += 1000;
            System.out.println("your score was " + finalscore);
        }

    }

}
