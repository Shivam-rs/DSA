package strvr.basic.math;

public class IntToRom {

    public static void main(String[] args) {
        int n = 2440;

        String s = intToRoman(n);
        System.out.println(s);
    }
    public static String intToRoman(int num) {
        StringBuilder s = new StringBuilder();
        while(num!=0){
            if(num >= 1000){
                s.append("M");
                num -= 1000;
                continue;
                //break;
            }
            if(num >=500){
                if(num >= 900){
                    s.append("CM");
                    num -= 900;
                    continue;
                    //break;
                }else{
                    s.append("D");
                    num -= 500;
                    continue;
                    //break;
                }
            }
            if(num>=100){
                if(num >= 400){
                    s.append("CD");
                    num -= 400;
                    continue;
                    //break;
                }else{
                    s.append("C");
                    num -= 100;
                    continue;
                    //break;
                }
            }
            if(num>=50){
                if(num >= 90){
                    s.append("XC");
                    num -= 90;
                    continue;
                    //break;
                }else{
                    s.append("L");
                    num -= 50;
                    continue;
                    //break;
                }
            }
            if(num>=10){
                if(num >= 40){
                    s.append("XL");
                    num -= 40;
                    continue;
                    //break;
                }else{
                    s.append("X");
                    num -= 10;
                    continue;
                    //break;
                }
            }
            if(num>=5){
                if(num >= 9){
                    s.append("IX");
                    num -= 9;
                    continue;
                    //break;
                }else{
                    s.append("V");
                    num -= 5;
                    continue;
                    //break;
                }
            }
            if(num<5){
                if(num >= 4){
                    s.append("IV");
                    num -= 4;
                    continue;
                    //break;
                }else{
                    s.append("I");
                    num -= 1;
                    continue;
                    //break;
                }
            }
        }

        return s.toString();
    }
}
