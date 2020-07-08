import java.util.*;

public class TopKFrequent {
    public static List<String> topKFrequent(String[] words,int k){
        // 1.统计单词出现次数，放入 Map 中
        Map<String,Integer> m = new HashMap<>();
        for(String word:words){
            m.put(word,m.getOrDefault(word,0)+1);
        }
        System.out.println(m);
        // 2. 使用优先级队列 建小堆 (降序)
        PriorityQueue<String> p = new PriorityQueue<>(
                (o1,o2)->(m.get(o1) - m.get(o2) == 0? o2.compareTo(o1):m.get(o1) - m.get(o2)));
        for(String s:m.keySet()){
            p.add(s);
            if(p.size() > k)
                p.poll();
        }
        System.out.println(p);
        // 3. 将小堆中元素放入集合 对集合排序
        List<String> list = new ArrayList<>();
        while (!p.isEmpty()){
            list.add(p.poll());
        }
        list.sort((o1,o2)->(m.get(o2) - m.get(o1) == 0? o1.compareTo(o2):m.get(o2) - m.get(o1)));
        return list;
    }
    public static void main(String[] args) {
        String[] s = new String[]{"i", "love", "leetcode", "i", "love", "coding"};
        int k = 2;
        List<String> l = topKFrequent(s,k);
        System.out.println(l);
    }
}
