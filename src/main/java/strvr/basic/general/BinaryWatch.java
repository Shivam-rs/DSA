package strvr.basic.general;

import java.util.ArrayList;
import java.util.List;

//@Link -  https://leetcode.com/problems/binary-watch/

public class BinaryWatch {
    public static void main(String[] args) {
        int setLed = 6;
        System.out.println(readBinaryWatch(setLed));
    }

    // Just check all the possible time and if setbits sum up to setled then add to your ans
    public static List<String> readBinaryWatch(int turnedOn) {
        List<String> ans = new ArrayList<>();
        for(int hr = 0; hr<12; hr++){
            for(int min =0; min<60; min++){
                if(Integer.bitCount(hr) + Integer.bitCount(min) == turnedOn){
                    if(min<10){
                        ans.add(String.format("%d:0%d",hr,min));
                    }else{
                        ans.add(String.format("%d:%d",hr,min));
                    }
                }
            }
        }

        return ans;
    }
}
