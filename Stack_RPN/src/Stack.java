public class Stack {
    private String[] elements= {};

    public String getElement(int x){
        return(elements[x]);
    }

    public Integer StackSize(){
        return(elements.length);
    }

    public void push(String element) {
        int x = elements.length;
        String[] temp = new String[x + 1];
        temp[0] = element;
        for (int i = 0; i < x; i++) {
            temp[i+1] = elements[i];
        }
        elements = temp;
    }

    public String pop() {
        int x = elements.length;
        if (x>0) {
            String[] temp = new String[x - 1];
            for (int i = 1; i < x; i++) {
                temp[i - 1] = elements[i];
            }
            String a=elements[0];
            elements = temp;
            return(a);
        }
        else {
            return("Empty Stack");
        }
    }

    public String peek() {
        if (elements.length>0) {
            return(elements[0]);
        }
        else {
            return("Empty Stack");
        }
    }
}
