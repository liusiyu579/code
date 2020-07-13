import java.util.ArrayList;

public class MaxInWindows {
    public static ArrayList<Integer> maxInWindows(int [] num, int size)
    {
        ArrayList<Integer> a = new ArrayList<>();
        if(num == null || num.length == 0 || size == 0){
            return a;
        }
        for(int i = 0;i < num.length-size+1;i++){
            int max = num[i];
            for(int j = i+1;j < i+size ; j++){
                if(num[j] > max){
                    max = num[j];
                }
            }
            a.add(max);
        }
        return a;
    }

    public static void main(String[] args) {
        int[] a = new int[]{2,3,4,2,6,2,5,1};
        int size = 3;
        System.out.println(maxInWindows(a,size));
    }
}
