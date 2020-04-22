public class MinNumberInRotateArray {

    public static int minNumberInRotateArray(int [] array) {
        if(array == null || array.length == 0){
            return 0;
        }
        int left = 0;
        int right = array.length-1;
        int mid = 0;
        while(array[left] >= array[right]){
            if(right - left == 1){
                mid = right;
                break;
            }
            mid = (left + right) >> 1;
            if(array[left] == array[right] && array[mid] == array[right]){
                int ret = array[left];
                for(int i = left+1;i < right;i++){
                    if(ret > array[i]){
                        ret = array[i];
                    }
                }
                return ret;
            }
            if(array[left] > array[mid]){
                right = mid;
            }else {
                left = mid;
            }
        }
        return array[mid];
    }

    public static void main(String[] args) {
        int[] a = new int[]{3,4,5,1,2};
        System.out.println(minNumberInRotateArray(a));
    }
}
