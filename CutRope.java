public class CutRope {

    public static int cutRope(int target) {
        if(target == 2){
            return 1;
        }
        if(target == 3){
            return 2;
        }
        if(target % 3 == 1){
            int k = target/3-1;
            return (int)Math.pow(3,k)*2*2;
        }
        if(target % 3 == 2){
            int k = target/3;
            return (int)Math.pow(3,k)*2;
        }
        return (int)Math.pow(3,target/3);
    }

    public static void main(String[] args) {
        int target = 8;
        System.out.println(cutRope(target));
    }
}
