package lab2;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Random rand = new Random();

        List<Integer> x = new ArrayList<>();
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < 5; i++) x.add(rand.nextInt(11));
        for (int i = 0; i < 7; i++) y.add(rand.nextInt(11));

        Collections.sort(x);
        Collections.sort(y);

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        List<Integer> xPlusY = new ArrayList<>(x);
        xPlusY.addAll(y);
        Collections.sort(xPlusY);
        System.out.println("a) xPlusY: " + xPlusY);

        Set<Integer> zSet = new TreeSet<>(x);
        zSet.retainAll(y);
        System.out.println("b) zSet: " + zSet);

        List<Integer> xMinusY = new ArrayList<>(x);
        xMinusY.removeAll(y);
        System.out.println("c) xMinusY: " + xMinusY);

        int p = 4;
        Set<Integer> tempSet = new TreeSet<>();
        for (Integer val : x) if (val <= p) tempSet.add(val);
        for (Integer val : y) if (val <= p) tempSet.add(val);

        List<Integer> xPlusYLimitedByP = new ArrayList<>(tempSet);
        System.out.println("d) xPlusYLimitedByP (p=" + p + "): " + xPlusYLimitedByP);
    }
}
