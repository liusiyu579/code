package three.config;
// 输入一个公司的所有员工信息，以及单个员工id，返回这个员工和他所有下属的重要度之和。
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
public class GetImporttance {
    public static int dfs(Map<Integer,Employee> m,int id){
        Employee cur = m.get(id);
        int sum = cur.importance;
        for(int curId:cur.subordinates){
            sum += dfs(m,curId);
        }
        return sum;
    }
    public static int getImportance(List<Employee> employees, int id) {
        if(employees.isEmpty()){
            return 0;
        }
        Map<Integer,Employee> m = new HashMap<>();
        for(Employee e :employees){
            m.put(e.id,e);
        }
        return dfs(m,id);
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        employee1.id = 1;
        employee1.importance = 5;
        employee2.id = 2;
        employee2.importance = 3;
        employee3.id = 3;
        employee3.importance = 3;
        List<Integer> e = new ArrayList<>();
        e.add(2);
        e.add(3);
        employee1.subordinates = e;
        List<Integer> e2 = new ArrayList<>();
        employee2.subordinates = e2;
        List<Integer> e3 = new ArrayList<>();
        employee3.subordinates = e3;
        List<Employee> list = new ArrayList<>();
        list.add(employee1);
        list.add(employee2);
        list.add(employee3);
        System.out.println(getImportance(list,1));
    }
}
