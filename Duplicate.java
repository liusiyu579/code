import java.util.*;
public class Duplicate {
    
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        Set<Integer> s = new HashSet<>();
        for(int i = 0;i < length;i++){
            if(s.contains(numbers[i])){
                duplication[0] = numbers[i];
                return true;
            }else {
                s.add(numbers[i]);
            }
        }
        return false;
    }
}