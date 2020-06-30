package three.config;
//给你一个坐标 (sr, sc) 表示图像渲染开始的像素值（行 ，列）和一个新的颜色值 newColor，让你重新上色这幅图像。
import java.util.Arrays;

public class FloodFill {
    public static int[][] post = new int[][]{{-1,0},{1,0},{0,1},{0,-1}};
    public static void dfs(int[][] image,int row,int col,int oldColor,int newColor,int x,int y,int[][] book){
        image[x][y] = newColor;
        book[x][y] = 1;

        // 上下左右四个方向 染色
        for(int i = 0;i<4;i++){
            int newX = x + post[i][0];
            int newY = y + post[i][1];
            if(newX < 0 || newX >= row || newY < 0 || newY >= col){
                continue;
            }
            if(image[newX][newY] == oldColor && book[newX][newY] == 0){
                dfs(image,row,col,oldColor,newColor,newX,newY,book);
            }
        }
    }
    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldColor = image[sr][sc];
        int row = image.length;
        int col = image[0].length;;
        int[][] book = new int[row][col];
        dfs(image,row,col,oldColor,newColor,sr,sc,book);
        return image;
    }

    public static void main(String[] args) {
        int[][] image = new int[][]{{1,1,1},{1,1,0},{1,0,1}};
        int sr = 1;
        int sc = 1;
        int newColor = 2;
        System.out.println(Arrays.deepToString(floodFill(image,sr,sc,newColor)));
    }
}
