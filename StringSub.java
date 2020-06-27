
public class StringSub {
    public int FindGreatestSumOfSubArray(int[] array) {
        int max = array[0];
        int cur = array[0];
        for(int i = 1;i < array.length;i++){
            cur = Math.max(cur+array[i],array[i]);
            if(max < cur)
                max = cur;
        }
        return max;
    }
}