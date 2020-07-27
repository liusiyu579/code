import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class MinTh4 {
    public static ArrayList<Integer> getLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> ret = new ArrayList<>();
        if(k < 0 || input == null || k > input.length){
            return ret;
        }
        PriorityQueue<Integer> p = new PriorityQueue<>(((o1, o2) -> o2-o1));
        for (int i = 0; i < input.length; i++) {
            p.add(input[i]);
            if(p.size() > k){
                p.poll();
            }
        }
        for (int i = 0; i < k; i++) {
            ret.add(p.poll());
        }
        Collections.sort(ret);
        return ret;
    }

    public static void main(String[] args) {
        int[] input = new int[]{5,3,9,7,8,1,4,6};
        int k = 3;
        ArrayList<Integer> a = getLeastNumbers_Solution(input,k);

        System.out.println(a);
    }
}
