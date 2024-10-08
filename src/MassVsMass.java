import nullMy.MyException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class MassVsMass {
    public static void main(String[] args) {

        initialData();

    }

    public static void initialData() {
        System.out.println("Введите колличество цифр в массиве: ");
        Scanner arr = new Scanner(System.in);
        String str = arr.nextLine();
        int numArr = Integer.parseInt(str);

        try {

        System.out.println("Введите число деления массива: ");
        Scanner k = new Scanner(System.in);
        String str2 = k.nextLine();
        int numK = Integer.parseInt(str2);
        fillingTheArray(numArr, numK);
            if (numK == 0 || numK < 0) throw new MyException("String can not be empty!");
        } catch (MyException e) {
            System.out.println(e.getMessage());
        }


    }

    public static void fillingTheArray(int a, int g) {

        ArrayList<Integer> massVsMass = new ArrayList<>();

        for (int i = 0; i < a; i++) {
            massVsMass.add(i);
        }

        listQueue(massVsMass, g);
    }

    public static void listQueue(ArrayList<Integer> MassVsMass, int k) {

        LinkedList<Integer> list = new LinkedList<>();

        double res = 0;
        for (
                int i = 0;
                i < k; i++) {
            list.add(MassVsMass.get(i));
        }
        System.out.println(list);
        for (
                int i = 1;
                i <= k; i++) {
            res = res + list.get(i - 1);
        }
        res = res / k;
        Queue<Double> queue = new LinkedList<>();
        queue.add(res);
        System.out.println(queue);
        for (
                int i = k; i < MassVsMass.size(); i++) {
            res = 0;
            list.add(MassVsMass.get(i));
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