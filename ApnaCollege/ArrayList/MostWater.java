package ApnaCollege.ArrayList;

import java.util.*;

public class MostWater {

    public static int StoreWater(ArrayList<Integer> Height) {

        int maxWater = 0;

        for (int i = 0; i < Height.size(); i++) {
            for (int j = i + 1; j < Height.size(); j++) {
                int ht = Math.min(Height.get(i), Height.get(j));
                int width = j - i;
                int currWater = ht * width;
                maxWater = Math.max(maxWater, currWater);
            }
        }
        return maxWater;

    }

    public static void main(String[] args) {
        ArrayList<Integer> Height = new ArrayList<>();
        Height.add(1);
        Height.add(8);
        Height.add(6);
        Height.add(2);
        Height.add(5);
        Height.add(4);
        Height.add(8);
        Height.add(3);
        Height.add(7);

        System.out.println(StoreWater(Height));

    }

}
