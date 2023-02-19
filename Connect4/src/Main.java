import java.util.Scanner;

public class Main {
    static char[][] board = new char[6][7];
    static boolean win = false;
    public static void main(String[] args) {
        initializeBoard();
        Scanner scan = new Scanner(System.in);
        while(!win){

            System.out.println("Enter a column number to make your move, player1");
            int column1 = scan.nextInt();
            player1move(column1);
            printBoard();
            testWinCondition();
            System.out.println("Enter a column number to make your move, player2");
            int column2 = scan.nextInt();
            player2move(column2);
            printBoard();
            testWinCondition();

        }
    }
    public static void player1move(int column){
        for(int i = board.length-1; i >=0 ;i--) {

            if (board[i][column] == '0'){
                board[i][column] = '1';
                break;
            }

        }
    }
    public static void player2move(int column) {
        for (int i = board.length-1; i >= 0; i--) {

                if (board[i][column] == '0') {
                    board[i][column] = '2';
                    break;
                }

        }
    }

    public static void initializeBoard() {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                    board[i][j] = '0';
            }
        }
    }
    public static void testWinCondition() {
        for (int j = 0; j < board[0].length - 3; j++) {
            for (int i = 0; i < board.length; i++) {
                if (board[i][j] == '1' && board[i][j + 1] == '1' && board[i][j + 2] == '1' && board[i][j + 3] == '1') {
                    System.out.println("Player 1 wins!");
                    win = true;
                } else if (board[i][j] == '2' && board[i][j + 1] == '2' && board[i][j + 2] == '2' && board[i][j + 3] ==
                        '2') {
                    System.out.println("Player 2 wins!");
                    win = true;
                }
            }
        }
        for(int i = 0; i < board.length-3; i++){
            for(int j = 0; j <board[0].length; j++){
                if(board[i][j] == '1' && board[i+1][j] == '1' && board[i+2][j] == '1' && board[i+3][j] == '1'){
                    System.out.println("Player 1 wins!");
                    win = true;
                    break;
                }else if(board[i][j] == '2' && board[i+1][j] == '2' && board[i+2][j] == '2' && board[i+3][j] == '2'){
                    System.out.println("Player 2 wins!");
                    win = true;
                    break;
                }
            }
        }
        for(int i = 3; i < board.length; i++){
            for(int j = 0; j < board[0].length-3; j++){
                if(board[i][j] == '1' && board[i-1][j+1] == '1' && board[i-2][j+2] == '1' && board[i-3][j+3] == '1'){
                    System.out.println("Player 1 wins!");
                    win = true;
                    break;
                }else if(board[i][j] == '2' && board[i-1][j+1] == '2' && board[i-2][j+2] == '2' && board[i-3][j+3] == '2'){
                    System.out.println("Player 2 wins!");
                    win = true;
                    break;
                }
            }
        }
        for(int i = 3; i < board.length; i++){
            for( int j = 3; j <board[0].length; j++){
                if(board[i][j] == '1' && board[i-1][j-1] == '1' && board[i-2][j-2] == '1' && board[i-3][j-3] == '1'){
                    System.out.println("Player 1 wins!");
                    win = true;
                    break;
                }else if(board[i][j] == '2' && board[i-1][j-1] == '2' && board[i-2][j-2] == '2' && board[i-3][j-3] == '2'){
                    System.out.println("Player 2 wins!");
                    win = true;
                    break;
                }
            }
        }
    }
    public static void printBoard(){
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                System.out.print("|" +board[i][j] + "|" + " ");
            }
            System.out.println();
        }
    }

}