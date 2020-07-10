
public class RobotWalk {

    public static void main(String[] args) {
        int a = 15;
        int row = 20;
        int col = 20;

        int n = movingCount(a,row,col);
        System.out.println(n);
    }

    private static int  movingCount(int threshold, int rows, int cols) {
        if(threshold < 0 || rows <= 0 || cols <= 0){
            return 0;
        }
        int[][] book = new int[rows][cols];
        return dfs(0,0,rows,cols,book,threshold);
    }
    static int a = 0;
    static int[][] post = new int[][]{{1,0},{-1,0},{0,-1},{0,1}};
    private static int dfs(int x,int y, int row, int col,int[][] book,int k) {
        // 1.判断坐标合不合法，坐标满不满足要求
        if(x < 0 || x >= row || y < 0 || y >= col || check(x) + check(y) > k || book[x][y] ==1){
            return 0;
        }
        // 2.改当前坐标的标记
        book[x][y] = 1;
        a++;
        // 3.换四个方位 上下左右
        for (int i = 0; i < 4; i++) {
            int newX = x + post[i][0];
            int newY = y + post[i][1];
            dfs(newX,newY,row,col,book,k);
        }
        return a;
    }
    public static int check(int n){
        int sum = 0;
        while (n>0){
            sum += (n%10);
            n /= 10;
        }
        return sum;
    }
}
