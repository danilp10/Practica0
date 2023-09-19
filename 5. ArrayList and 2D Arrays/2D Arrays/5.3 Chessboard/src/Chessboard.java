public class Chessboard
{
   public static void main(String[] args)
   {
      char[][] chessboard = new char[8][8];

      for (int x = 0; x < chessboard.length; x++)
      {
         for (int y = 0; y < chessboard[0].length; y++)
         {
            if ((y+x) % 2 == 0) {
               chessboard[x][y] = '□';
            }
            else chessboard[x][y] = '■';
         }
      }
      for (char[] row: chessboard)
      {
         for (char square: row)
         {
            System.out.print(square);
         }
         System.out.println();
      }
   }
}