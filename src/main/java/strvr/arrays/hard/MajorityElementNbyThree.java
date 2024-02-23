package strvr.arrays.hard;

import java.util.ArrayList;
import java.util.List;

//@Link - https://leetcode.com/problems/majority-element-ii/
//@Link - https://www.codingninjas.com/studio/problems/majority-element_6915220?utm_source=striver&utm_medium=website&utm_campaign=a_zcoursetuf&leftPanelTabValue=SUBMISSION
//@Link - https://takeuforward.org/data-structure/majority-elementsn-3-times-find-the-elements-that-appears-more-than-n-3-times-in-the-array/

public class MajorityElementNbyThree {
    public static void main(String[] args) {
        int[] arr = {1, 33, 33, 11, 33, 11};
        int[] arr1 = {0,  0,0};
        List<Integer> ans = majorityElement(arr);
        if(!ans.isEmpty()){
            System.out.print("The majority elements are: ");
            for (Integer an : ans) {
                System.out.print(an + " ");
            }
        }else{
            System.out.println("No such element");
        }

    }


    //Crux of this algo is that we are cancelling elements that are appearing less number of times
    //This is also known as Boyer Moore Voting algo -> originally designed for N/2 we are extending it here
    public static List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int majority = n/3 +1;
        int el1= Integer.MIN_VALUE, el2=Integer.MIN_VALUE; //Imp for use case where all the elements are 0
        int count1 = 0, count2 = 0;

        List< Integer > ans = new ArrayList<>();

        for(int val : nums){
            if(count1 == 0 && el2 != val){ //@nd part of condition is very important so that me maintain unique counts for el1 & el2
                el1 = val;
                count1 = 1;
            }else if(count2 == 0 && el1 != val){
                el2 = val;
                count2 = 1;
            }else if(el1 == val ) count1++;
            else if(el2 == val) count2++;
            else {
                count1--;
                count2--;
            }
        }

        //This is for the case where there are no or just 1 majority element.
        count1 = 0; count2 = 0;
        for(int val : nums){
            if(val == el1) count1++;
            if(val == el2) count2++;
        }

        if(count1>= majority) ans.add(el1);
        if(count2>= majority) ans.add(el2);

        return ans;

    }
}
