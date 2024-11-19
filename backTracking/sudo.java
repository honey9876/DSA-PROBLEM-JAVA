public class sudo {
    public static boolean isSafe(int sudoku[][], int row, int col, int digit){
        for(int i=0; i<=8; i++ ){
            if (sudoku[i] [col] == digit) {
                return false;
            }
           
        }

        for(int j=0; j<=8; j++){
           if(sudoku[row][j] == digit) {
             return false;
           }
        }
        

    }
    public static boolean sudouSolver(int sudoku[][], int row, int col){
       
        if (row == 9 && col == 9) {
            return true;
        }
          

        int nextRow = row, nextCol = col+1;
        if (col+1 == 9)  {
            nextCol = row +1;
            nextCol  = 0;

        }
        if (sudoku[row][col] != 0) {
            return sudouSolver(sudoku, nextRow, nextCol);
        }

        for(int digit = 1; digit<= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit;
                if (sudouSolver(sudoku, nextRow, nextCol)) {
                    return true;
                }
                sudoku[row][col] = 0;
            }
        }
        return false;
    }
    public static void printSudoku(int sudoku[] []) {
        for(int i=0; i<9; i++){
            for(int j = 0; j<9; j++){
                System.out.println(sudoku[i][j]+ " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int sudo[][] = {{0, 0, 8, 0, 0, 0, 0, 0},
        {4, 9, 0, 1, 5, 7, 0, 0, 2},
        {0, 0, 3, 0, 7, 7, 0, 0, 8},
        {6, 9, 0, 1, 5, 7, 0, 0, 2},
        {3, 0, 0, 4, 9, 0, 0, 2, 5},
        {4, 9, 0, 4, 5, 7, 8, 5, 7},
        {7, 9, 7, 1, 6, 1, 9, 0, 8},
        {8, 0, 0, 3, 5, 7, 9, 0, 0},
        {0, 0, 9, 4, 7, 4, 9, 8, 0} };
        
        if (sudouSolver(sudo, 0, 0)) {
            System.out.println("solution");
            printSudoku(sudoku);
        }else {
            System.out.println("solution does not exist");
        }
    }
}
