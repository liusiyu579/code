public class Find {
    public static boolean find(int target, int [][] array) {
        if(array == null || array.length == 0){
            return false;
        }
        int i = 0;
        int j = array[0].length-1;
        while(i < array.length && j >= 0){
            if(target < array[i][j]){
                j--;
            }else if(target > array[i][j]){
                i++;
            }else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int t = 4;
        int[][] a = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(find(t,a));
    }
}
