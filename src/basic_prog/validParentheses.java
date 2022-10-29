import java.util.Stack;

class ValidParentheses {
    public static void main(String args[]) {
        String s="({})[]";
        Stack<Character> st= new Stack<>();
        
        for(char c: s.toCharArray()){
            if(c=='(')
                st.push(')');
            else if(c=='[')
                st.push(']');
            else if(c=='{')
                st.push('}');
            else if(st.empty() || st.pop()!=c){
              { 
                System.out.println("Not Valid");
                return;
              }
            }
            
        }
        
        if(st.empty()) System.out.println("Valid");
        else System.out.println("Not Valid"); 
    }
}
