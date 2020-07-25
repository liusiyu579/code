public class Power {
    public static double power(int x,int n){
        double ret = 0;
        if(n == 0){
            return 1;
        }else {
            ret = power(x,n/2);
            ret = ret * ret;
            if(n % 2 != 0){
                ret = ret * x;
            }
        }
        return ret;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 3;
        System.out.println(power(x,n));
    }
}
