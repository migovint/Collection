import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<Integer, String> map1 = new HashMap<Integer, String>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
       for(Map.Entry<Integer, String> entry :map1.entrySet()){
            map2.put(entry.getValue(), entry.getKey());
        }
        for(Map.Entry en:map2.entrySet()){
            System.out.println(en.getKey() + " " + en.getValue());
        }





    }
}