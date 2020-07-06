public class LemonChange {
    public static boolean lemonadeChange(int[] bills) {
        int five = 0,ten = 0;
        for(int n:bills){
            if(n == 5){
                five++;
            }else if(n == 10){
                if(five == 0){
                    return false;
                }
                five--;
                ten++;
            }else {
                if(ten >= 1 && five >= 1){
                    ten--;
                    five--;
                }else if(five >= 3){
                    five = five-3;
                }else {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[]{5,5,5,10,20};
        System.out.println(lemonadeChange(a));
    }
}

