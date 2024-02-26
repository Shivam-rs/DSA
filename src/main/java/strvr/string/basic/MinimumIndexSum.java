package strvr.string.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;


//@Link - https://leetcode.com/problems/minimum-index-sum-of-two-lists/

//Create a hashMap and put all the strings from smaller array into it along with index
//Now iterate over the larger array and get value from the map
//If value is not null then compare it with min and accordingly update the ans arraylist
public class MinimumIndexSum {
    public static String[] findRestaurant(String[] list1, String[] list2) {
        if (list1.length > list2.length) {
            return findRestaurant(list2, list1);
        }

        HashMap<String, Integer> holder = new HashMap<>();
        int i = 0;
        for(String s : list1){
            holder.put(s, i);
            i++;
        }
        int min = 2000;
        ArrayList<String> ans = new ArrayList<>();

        for(int j = 0; j<list2.length; j++){
            Integer temp = holder.get(list2[j]);

            if(temp != null){
                int sum = temp + j;
                if(sum == min){
                    ans.add(list2[j]);
                }
                if(sum<min){
                    ans.clear();
                    min = sum;
                    ans.add(list2[j]);
                }
            }
        }

        return ans.toArray(new String[0]);
    }

    public static void main(String[] args) {
        String[] list1 = new String[]{"Shogun","Tapioca Express","Burger King","KFC"};
        String[] list2 = new String[]{"Piatti","The Grill at Torrey Pines","Hungry Hunter Steakhouse","Shogun"};

        //Output: ["Shogun"]
        System.out.println(Arrays.toString(findRestaurant(list1,list2)));
    }


    /*public static String[] findRestaurant(String[] list1, String[] list2) {
        HashMap<String, Integer> holder = new HashMap<>();
        int i = 0;
        for(String s : list1){
            holder.put(s, -i-1);
            i++;
        }
        System.out.println(holder.toString());
        int j = 0;
        for(String s : list2){
            if(holder.containsKey(s)){
                holder.put(s,j-holder.get(s)-1);
            }
            j++;
        }
        System.out.println(holder.toString());
        int min = 2000;
        for(String s : holder.keySet()){
            int temp = holder.get(s);
            if(temp >= 0)
                min = Math.min(min,holder.get(s));
        }

        ArrayList<String> ans = new ArrayList<>();
        for(String s : holder.keySet()){
            if(holder.get(s) == min){
                ans.add(s);
            }
        }

        return ans.toArray(new String[0]);
    }*/
}
