public class HundredthPrime
{
   public static void main(String[] args)
   {
      int currentNumber = 1;
      int counter = 0;

      while (counter < 100) {
         currentNumber ++;

         for (int divisor = currentNumber - 1; divisor > 1; divisor --) {
            if (divisor == 2) {
               counter ++;
            }

            else if (currentNumber % divisor == 0) {
               break;
            }

         }

      }
      System.out.println(currentNumber);
   }
}
