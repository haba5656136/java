public static boolean solveHorse(int[][] board, int count, int row, int col) {


    System.out.println(count);
    if (count == 25) {
        printBoard(board);
        return true;
    }

    for (int i = 0; i < steps.length; i++) {

        int newRow = row + steps[i][0];
        int newCol = col + steps[i][1];

        if(checkStep(board, newRow, newCol)) {
            board[newRow][newCol] = ++count;
            if (!solveHorse(board, count, newRow, newCol)) {
                board[newRow][newCol] = 0;
                count--;
            } else return true;
        }

    }

    return false;

}

static int[][] steps = {
    {-2, -1},
    {-2, 1},
    {-1, -2},
    {-1, 2},
    {1, -2},
    {1, 2},
    {2, -1},
    {2, 1},
};

