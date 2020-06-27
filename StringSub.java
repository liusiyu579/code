//{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0
//个开始,到第3个为止)。给一个数组，返回它的最大连续子序列的和
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