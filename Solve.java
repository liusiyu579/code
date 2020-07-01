package three.config;
// 给定一个二维的矩阵，包含 'X' 和 'O'（字母 O）。

// 找到所有被 'X' 围绕的区域，并将这些区域里所有的 'O' 用 'X' 填充。
import java.util.Arrays;

public class Solve {
     static int[][] post = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    public static   void dfs(char[][] board,int row,int col,int x,int y){
        // 把当前位置设为"A"
        board[x][y] = 'A';
        for(int i = 0;i<4;i++){
            int newX = x + post[i][0];
            int newY = y + post[i][1];
            if(newX < 0 || newX >= row || newY < 0 || newY >= col){
                continue;
            }
            if(board[newX][newY] != 'A' && board[newX][newY] != 'X'){
                dfs(board,row,col,newX,newY);
            }
        }
    }
    public static void solve(char[][] board) {
        if(board.length == 0){
            return;
        }
        int row = board.length;
        int col = board[0].length;
        for(int i = 0;i< col;i++){
            if(board[0][i] == 'O'){
                dfs(board,row,col,0,i);
            }
            if(board[row-1][i] == 'O'){
                dfs(board,row,col,row-1,i);
            }
        }
        for(int i = 0;i< row;i++){
            if(board[i][0] == 'O'){
                dfs(board,row,col,i,0);
            }
            if(board[i][col-1] == 'O'){
                dfs(board,row,col,i,col-1);
            }
        }
        System.out.println(Arrays.deepToString(board));
        for(int i = 0;i < row;i++){
            for(int j = 0;j < col;j++){
                if(board[i][j] == 'A'){
                    board[i][j] = 'O';
                }else if(board[i][j] == 'O'){
                    board[i][j] = 'X';
                }
            }
        }
    }

    public static void main(String[] args) {
        char[][] c = new char[][]{{'X','X','X','X'},
                {'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        solve(c);
        System.out.println(Arrays.deepToString(c));
    }
}
