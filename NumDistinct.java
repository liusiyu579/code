package three.config;
//给定一个字符串S和一个字符串T，计算S中的T的不同子序列的个数。
//字符串的子序列是由原来的字符串删除一些字符（也可以不删除）在不改变相对位置的情况下的剩余字符（例如，"ACE"is a subsequence of"ABCDE"但是"AEC"不是）

public class NumDistinct {
    public static int numDistinct (String S, String T) {
        // write code here
        int lenA = S.length();
        int lenB = T.length();
        int[][] a = new int[lenA+1][lenB+1];
        a[0][0] = 1;
        for(int i = 1;i <= lenA;i++){
            a[i][0] = 1;
        }
        for(int i = 1;i<= lenA;i++){
            for(int j = 1;j <= lenB;j++){
                if(S.charAt(i-1) == T.charAt(j-1)){
                    a[i][j] = a[i-1][j-1]+a[i-1][j];
                }else {
                    a[i][j] = a[i-1][j];
                }
            }
        }
        return a[lenA][lenB];
    }

    public static void main(String[] args) {
        String s = "rabbbit";
        String t = "rabbit";
        int a = numDistinct(s,t);
        System.out.println(a);
    }
}
