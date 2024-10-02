import java.util.*;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("HashMap замена ключа и значения: ");
        main.collection();
        System.out.println();
        System.out.println("ArrayList и LinkedList кто быстрее: ");
        main.randCollection();
        System.out.println();
        System.out.println("Уборка дубликатов из ArrayList: ");
        main.removesDuplicates();
    }

    public void collection() {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1, "A");
        map1.put(2, "B");
        map1.put(3, "C");
        HashMap<String, Integer> map2 = new HashMap<>();
        for (Map.Entry<Integer, String> entry : map1.entrySet()) {
            map2.put(entry.getValue(), entry.getKey());
        }
        for (Map.Entry<String, Integer> en : map2.entrySet()) {
            System.out.println(en.getKey() + " " + en.getValue());
        }
    }

    public void randCollection() {
        ArrayList<Integer> list1 = new ArrayList<>();
        LinkedList<Integer> list2 = new LinkedList<>();
        Random rand = new Random();
        for (int i = 0; i < 1000000; i++) {
            list1.add(rand.nextInt(1000000));
        }
        for (int i = 0; i < 1000000; i++) {
            list2.add(rand.nextInt(1000000));
        }

        long startTime1 = System.currentTimeMillis();

        for (int i = 0; i < 1000; i++) {
            list1.get(rand.nextInt(1000));

        }
        long endTime = System.currentTimeMillis();
        long timeTaken1 = endTime - startTime1;
        System.out.println("ArrayList выполнен за " + timeTaken1 + " миллисекунд.");

        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i < 1000; i++) {
            list2.get(rand.nextInt(1000));
        }
        long endTime2 = System.currentTimeMillis();
        long timeTaken2 = endTime2 - startTime2;
        System.out.println("LinkedList выполнен за " + timeTaken2 + " миллисекунд.");


    }

    public void removesDuplicates() {
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(6);
        list1.add(5);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        HashSet<Integer> map1 = new HashSet<>();
        map1.addAll(list1);
        System.out.println(map1);
    }

}