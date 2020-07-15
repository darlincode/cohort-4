public class ArrayKnightTour {
    static int[][] board;

    public static void main(String[] args) {
        int horizontal[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int vertical[] = { -1, -2, -2, -1, 1, 2, 2, 1 };

        board = new int[8][8];
        int currentRow = (int) (Math.random() * 8);
        int currentColumn = (int) (Math.random() * 8);
        int moveNumber = 0;

        board[ currentRow ][ currentColumn ] = ++moveNumber;
        boolean isDone = false;

        
        while (!isDone) {
          int moveType = 0;
          int testRow = currentRow + vertical[ moveType ];
          int testColumn = currentColumn + horizontal[ moveType ];
          boolean isGoodMove = validMove( testRow, testColumn );
          
   
          if (isGoodMove) {
              currentRow = testRow;
              currentColumn = testColumn;
              board[ currentRow ][ currentColumn ] = ++moveNumber;
          } else { 
              for (int count = 0; count < 7 && !isGoodMove; count++) {
                  moveType = ++moveType % 8;
                  testRow = currentRow + vertical[ moveType ];
                  testColumn = currentColumn + horizontal[ moveType ];
                  isGoodMove = validMove( testRow, testColumn );

                  
                  if (isGoodMove) {
                      currentRow = testRow;
                      currentColumn = testColumn;
                      board[ currentRow ][ currentColumn ] = ++moveNumber;
                  }
              }
                
              if (!isGoodMove) {
                  isDone = true;
              }
          }
            
          if (moveNumber == 64) {
              isDone = true;
          }
        } 

        String statusBar = "The tour ended with " + moveNumber + " moves.";

        if (moveNumber == 64) {
            statusBar += " This was a full tour!";
        } else {
            statusBar += " This was not a full tour.";
        }

        printTour();
        System.out.printf("\n\n" + statusBar);
    }

    public static boolean validMove(int row, int column) {
        
        return ( row >= 0 && row < 8 && column >= 0 && column < 8 && board[ row ][ column ] == 0 );
    }

    public static void printTour() {
        String buildString = "\t";

        for (int i = 0; i < 8; i++) {
            buildString += i + "\t";
        }

        buildString += "\n\n";
        System.out.printf(buildString);
        buildString = "";

        for (int row = 0; row < board.length; row++) {
            buildString += row + "\t";

            for (int column = 0; column < board[row].length; column++) {
                buildString += board[row][column] + "\t";
            }
            buildString += "\n";
        }
        System.out.printf(buildString);
    }
}
