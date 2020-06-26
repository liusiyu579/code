public class Path2 {

    public static int uniquePaths (int m, int n) {
        // write code here
        int[][] a = new int[m][n];
        for(int i = 0;i < m;i++){
            a[i][0]=1;
        }
        for(int i = 1;i < n;i++){
            a[0][i]=1;
        }
        for(int i = 1;i < m;i++){
            for(int j = 1;j < n;j++){
                a[i][j] = a[i-1][j]+a[i][j-1];
            }
        }
        return a[m-1][n-1];
    }
    public static void main(String[] args) {
        int m = 1;
        int n = 2;
        int k = uniquePaths(m,n);
        System.out.println(k);
    }
}