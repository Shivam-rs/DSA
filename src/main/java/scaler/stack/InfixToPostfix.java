package scaler.stack;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String s = "x^y/(a*z)+b";
        System.out.println(infixToPostfix(s));
    }

    public static String infixToPostfix(String s){
        int n = s.length();
        StringBuilder ans = new StringBuilder();
        Stack<Character> st = new Stack<>();

        for(int i = 0; i<n; i++){
            char ch = s.charAt(i);

            if(Character.isAlphabetic(ch)){
                ans.append(ch);
            }else if(ch == '('){
                st.push(ch);
            }else if(ch == ')'){
                while(st.peek() != '('){
                    ans.append(st.pop());
                }
                st.pop();
            }else if(isOperator(ch) ){
                while(!st.isEmpty() && precedenceOf(ch) <= precedenceOf(st.peek())){
                    ans.append(st.pop());
                }
                st.push(ch);
            }
        }

        while(!st.isEmpty()){
            ans.append(st.pop());
        }

        return ans.toString();
    }

    public static boolean isOperator(char ch){
        return ch == '-' || ch == '+' || ch == '/' || ch == '*' || ch == '^';
    }

    public static int precedenceOf(char ch){
        switch (ch){
            case '+':
            case '-': return 1;
            case '*':
            case '/': return 2;
            case '^': return 3;
            default:  return -1;
        }
    }
}
