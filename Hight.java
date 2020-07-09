import java.util.Scanner;

public class Hight {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String[] s = sc.next().split(",");
            int[] a = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i] = Integer.valueOf(s[i]);
            }
            int n = trap(a);
            System.out.println(n);
        }
    }

    private static int trap(int[] a) {
        int len = a.length;
        int[] left = new int[len];
        int[] right = new int[len];
        left[0] = a[0];
        right[len-1] = a[len-1];
        for (int i = 1; i < len-1; i++) {
            left[i] = Math.max(left[i-1],a[i]);
        }
        for (int i = len-2; i >= 0; i--) {
            right[i] = Math.max(right[i+1],a[i]);
        }
        int sum = 0;
        for (int i = 1; i < len-1; i++) {
            int min = Math.min(left[i],right[i]);
            if(a[i] < min)
                sum+=(min - a[i]);
        }
        return sum;
    }
}
