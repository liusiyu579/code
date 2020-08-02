import java.util.Arrays;

public class Multiply {
    public static int[] multiply(int[] A) {
        if(A == null || A.length < 2){
            return null;
        }
        int[] B = new int[A.length];
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i-1] * A[i-1];
        }
        int tmp = 1;
        for (int i = A.length -2; i >= 0 ; i--) {
            tmp = tmp * A[i+1];
            B[i] = B[i] * tmp;
        }
        return B;
    }

    public static void main(String[] args) {
        int[] A = new int[]{2,3,4,5};
        System.out.println(Arrays.toString(multiply(A)));
    }
}
