package postfix;


public class Stack {


    protected class ListNode {
        protected char info;
        protected ListNode next;
    }
    
    private ListNode top;
    
    
    Stack() {
        top = null;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
    
    public void Push(char info) {
        ListNode newNode = new ListNode();
        newNode.info = info;
    
        if(isEmpty()) {
            newNode.next = null;
            top = newNode;
        }
        else {
            newNode.next = top;
            top = newNode;
        }
    }
    
    public char Pop() {
        if(isEmpty()) {           
            return '*';
        }           
        char val = top.info;
        top = top.next;
        return val;
    }
    
    public boolean Validate(String s) {
       boolean valid = true;
       for(int i = 0;i < s.length();i++) {
           if(s.charAt(i) == '(' ||s.charAt(i) == '[' || s.charAt(i) == '{') {
               Push(s.charAt(i));
           }
           if(s.charAt(i) == ')' ||s.charAt(i) == ']' || s.charAt(i) == '}') {
               char pop = Pop();
               if(((pop == '(') && (s.charAt(i) == ')')) || ((pop == '[') && (s.charAt(i) == ']')) || ((pop == '{') && (s.charAt(i) == '}'))) {
                   valid = true;
               }
               else {
                   valid = false;
               }                  

           }
       }
       if(!isEmpty()) {
           return valid;
       }
       return valid; 
    }
}

