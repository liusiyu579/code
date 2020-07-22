public class IsNumeric {
    public static boolean isNumeric(char[] str) {
        // +-     小数点      e是否出现过
        boolean sign = false,decimal = false,hasE = false;
        for(int i = 0;i < str.length;i++){
            if(str[i] == 'e' || str[i] == 'E'){
                // e后面一定接数字
                if(i == str.length-1)
                    return false;
                if(hasE)// 不能同时存在两个e
                    return false;
                hasE = true;
            }else if(str[i] == '+'|| str[i] == '-'){
                // 第二次出现标点符号 那必须紧跟在e后
                if(sign && str[i-1] != 'e' && str[i-1] != 'E')
                    return false;
                // 第一次出现+-  如果不是在开头 那也只能紧跟在e后
                if(!sign && i > 0 && str[i-1] != 'e' && str[i-1] != 'E')
                    return false;
                sign = true;
            }else if(str[i] == '.'){
                // e 后面不能直接跟. 小数点不能出现两次
                if(hasE || decimal)
                    return false;
                decimal = true;
            }else if(str[i] <'0' || str[i] > '9')
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
//        char[] str = new char[]{'5','e','2'};
//        char[] str = new char[]{'1','a','3','.','1','4'};
        char[] str = new char[]{'-','1','E','-','1','6','e'};
        System.out.println(isNumeric(str));
    }
}
