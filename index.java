import java.util.HashMap;
import java.util.Map;

public class index{
    public static void main(String[] args) {
        Map<String, Integer> students = new HashMap<>();
        students.put("Abiud", 40);
        students.put("Sokomi", 50);
        students.put("Shiundu", 60);
        students.put("Caren", 55);
        
        System.out.println(students.replace("Sokomi", 50, 70));

        for(String name : students.keySet()){
            System.out.println(name + " : " + students.get(name) );
        }

    }
}