import java.util.*;

public class FindMaxNumStr {

    public static int countNum(String str,int index){
        int count = 1;
        for (int i = index+1; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch >= '0' && ch <= '9'){
                count++;
            }else {
                break;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            Map<Integer,String> m = new TreeMap<>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if(ch >= '0' && ch <= '9'){
                    int count = countNum(str,i);
                    m.put(count,str.substring(i,i+count));
                    i+=count;
                }
            }
            int i = m.size();
            for(Map.Entry<Integer, String> e:m.entrySet()){
                if(i == 1){
                    System.out.println(e.getValue());
                }
                i--;
            }
        }
    }
}
