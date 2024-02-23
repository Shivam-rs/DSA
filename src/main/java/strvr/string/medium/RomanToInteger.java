package strvr.string.medium;

public class RomanToInteger {
    public static void main(String[] args) {
        String s = "MCMXCIV";

        System.out.println(romanToInt(s));
    }

    public static int romanToInt(String s) {
        int output = 0;
        int e = s.length() -1;

        //Iterate over each char in string
        for(int i = 0; i<s.length(); i++){

            switch(s.charAt(i)){
                case 'I':
                    //If next value is V or X then add 4 or 9 and then break away
                    //Else add 1
                    if(i != e && s.charAt(i+1) == 'V'){
                        output +=4;
                        i++;
                        break;
                    }else{
                        if(i != e && s.charAt(i+1) == 'X'){
                            output +=9;
                            i++;
                            break;
                        }
                    }
                    output += 1;
                    break;

                case 'V':
                    output += 5;
                    break;

                //Same as above
                case 'X':
                    if(i != e && s.charAt(i+1) == 'L'){
                        output +=40;
                        i++;
                        break;
                    }else{
                        if(i != e && s.charAt(i+1) == 'C'){
                            output +=90;
                            i++;
                            break;
                        }
                    }
                    output += 10;
                    break;

                case 'L':
                    output += 50;
                    break;

                //Same as above
                case 'C':
                    if(i != e && s.charAt(i+1) == 'D'){
                        output +=400;
                        i++;
                        break;
                    }else{
                        if(i != e && s.charAt(i+1) == 'M'){
                            output +=900;
                            i++;
                            break;
                        }
                    }
                    output += 100;
                    break;

                case 'D':
                    output += 500;
                    break;

                case 'M':
                    output += 1000;
                    break;
            }
        }
        return output;
    }
}
