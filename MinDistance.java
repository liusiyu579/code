package three.config;

public class MinDistance {
    public static int minDistance (String word1, String word2) {
        // write code here
        int lenA = word1.length();
        int lenB = word2.length();
        int[][] a = new int[lenA+1][lenB+1];
        for(int i = 0;i<lenA+1;i++){
            a[i][0] = i;
        }
        for(int i = 0;i < lenB+1;i++){
            a[0][i] = i;
        }
        for(int i = 1;i <= lenA;i++){
            for(int j = 1;j <= lenB;j++){
                if(word1.charAt(i-1) == word2.charAt(j-1)){
                    a[i][j]= a[i-1][j-1];
                }else {
                    a[i][j]= a[i-1][j-1]+1;
                }
                a[i][j] = Math.min(
                        a[i][j],1+Math.min(a[i][j-1],a[i-1][j]));
            }
        }
        return a[lenA][lenB];
    }

    public static void main(String[] args) {
        String s = "code";
        String s2 = "leet";
        System.out.println(minDistance(s,s2));
    }
}
