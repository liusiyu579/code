package three.config;

public class MinPal {
    public static int minCut (String s) {
        // write code here
        int n = s.length();
        if(n == 0){
            return 0;
        }
        int[] minNum = new int[n+1];
        for(int i = 0;i< minNum.length;i++){
            minNum[i] = i-1;
        }
        for(int i = 2;i< minNum.length ;i++){
            for(int j = 0;j < i;j++){
                if(isPal(s,j,i-1)){
                    minNum[i] = Math.min(minNum[i],minNum[j]+1);
                }
            }
        }
        return minNum[n];
    }
    public static boolean isPal(String s,int start,int end){
        while(start < end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }

    public static void main(String[] args) {
        String b = "bbe";
        int a = minCut(b);
        System.out.println(a);
    }
}
