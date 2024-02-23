package strvr.string.basic;

//@Link - https://leetcode.com/problems/reverse-words-in-a-string/
//@link - https://takeuforward.org/data-structure/reverse-words-in-a-string/
public class ReverseWords {
    public static void main(String[] args) {
        String str = "the sky is blue";
        //String ans = reverseWords(str);
        System.out.println(reverseWords(str));
    }


    //Store word in temp
    //Once space is identified, add temp into ans in following way:
        // If ans is empty then just add temp
        //If ans is not empty then update ans to temp + " " + ans (This way every new word would be added to start of the ans)
    public static String reverseWords(String str) {

        String temp = "", ans = "";
        int n = str.length();

        for(int i = 0; i< n; i++){
            char ch = str.charAt(i);

            if(ch != ' ' ){
                temp += ch;
            }else if(!temp.isEmpty()){
                if(ans.isEmpty()){
                    ans = temp;
                }else{
                    ans = temp +" "+ ans;
                }
                temp = "";
            }
        }

        //This is to add teh last word
        if(!temp.isEmpty()){
            if(ans.isEmpty()){
                ans = temp;
            }else{
                ans = temp +" "+ ans;
            }
        }

        return ans;

    }
}
