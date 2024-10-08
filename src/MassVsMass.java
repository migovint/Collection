import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class MassVsMass {
    public static void main(String[] args) {
        ArrayList<Integer> massVsMass = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            massVsMass.add(i);
        }
        LinkedList<Integer> list = new LinkedList<>();
        int k = 3;
        double res = 0;
        for (int i = 0; i < k; i++) {
            list.add(massVsMass.get(i));
        }
        System.out.println(list);
        for (int i = 1; i <= k; i++) {
            res = res + list.get(i - 1);
        }
        res = res / k;
        Queue<Double> queue = new LinkedList<>();
        queue.add(res);
        System.out.println(queue);
        for (int i = k; i < massVsMass.size(); i++) {
            res = 0;
            list.add(massVsMass.get(i));
            list.remove();
            System.out.println(list);
            for (int j = 1; j <= k; j++) {
                res = res + list.get(j - 1);
            }
            res = res / k;
            queue.clear();
            queue.add(res);
            System.out.println(queue);
        }

    }
}
