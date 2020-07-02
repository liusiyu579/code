public class HasPath {

     int[][] post = new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
    public  boolean dfs(char[] matrix, int x,int y,
                              int index,char[] str,int rows,int cols){
        // 1.判断是否越界
        if(x < 0 || x >= rows || y < 0 || y >= cols){
            return false;
        }
        char ch = matrix[x * cols + y];

        // 2.判断有没有访问过
        // 如果没有访问过 看是否和字符串index位置匹配
        if(ch == '#' || ch != str[index]){
            return false;
        }

        // 如果匹配 判断是否匹配到最后一个字符
        if(index +1 == str.length){
            return true;
        }

        // 3.标记此处
        matrix[x * cols + y] = '#';

        // 4. 4个方位
        for (int i = 0; i < 4; i++) {
            int newX = x + post[i][0];
            int newY = y + post[i][1];
            if(dfs(matrix,newX,newY,index+1,str,rows,cols)){
                return true;
            }
        }
        // 如果4个方位都无法匹配 index+1 就将标记的还原
        matrix[x * cols + y] = ch;
        return false;
    }
    public boolean hasPath(char[] matrix, int rows, int cols, char[] str) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(dfs(matrix,i,j,0,str,rows,cols)){
                    return true;
                }
            }
        }
        return false;
    }
}
