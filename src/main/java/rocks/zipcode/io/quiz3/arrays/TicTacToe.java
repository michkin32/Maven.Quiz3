package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class TicTacToe {
    String[][] board;

    public TicTacToe(String[][] board) {
        this.board = board;
    }

    public TicTacToe() {
    }

    public String[] getRow(Integer value) {
        String[] stringArray = new String[3];
        for (int i =0; i < stringArray.length; i++){
            stringArray[i] = board[value][i];
        }
        return stringArray;
    }

    public String[] getColumn(Integer value) {
        String[] stringArray = new String[3];
        for (int i =0; i < stringArray.length; i++){
            stringArray[i] = board[i][value];
        }
        return stringArray;
    }

    public Boolean isRowHomogenous(Integer rowIndex) {

            if (board[rowIndex][0].equals(board[rowIndex][1]) && board[rowIndex][0].equals(board[rowIndex][2])){
                return true;
            }

        return false;
    }

    public Boolean isColumnHomogeneous(Integer columnIndex) {
        if (board[0][columnIndex].equals(board[1][columnIndex]) && board[0][columnIndex].equals(board[2][columnIndex])){
            return true;
        }

        return false;
    }

    public String getWinner() {
        for (int i =0; i < board.length -1; i++){
            if(isColumnHomogeneous(i)){
                return board[i][0];
            }else if (isRowHomogenous(i)){
                return board[0][i];
            }
        }
        return "Tie";
    }

    public String[][] getBoard() {
        return board;
    }
}
