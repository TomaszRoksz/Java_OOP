import java.util.regex.Pattern;

public class ONP {

    private Stack onpStack = new Stack();


    private static String
    StringIndex(String str, int index){
        return String.valueOf(str.charAt(index));
    }

    private static Integer
    getIntFromString(String str){
        int i = Integer.parseInt(str);
        return i;
    }


    public String calculate(String str) {
        String[] tokens = str.split("\\s+");

        for (String token : tokens) {
            if (Pattern.matches("[0-9]+", token)) {
                // If the token is a number, push it into the stack
                onpStack.push(token);
            } else if (Pattern.matches("[+*/-]", token)) {
                // If the token is an operator, perform the operation
                if (onpStack.StackSize() >= 2) {
                    Integer operand2 = getIntFromString(onpStack.pop());
                    Integer operand1 = getIntFromString(onpStack.pop());
                    Integer result;

                    switch (token) {
                        case "+":
                            result = operand1 + operand2;
                            break;
                        case "-":
                            result = operand1 - operand2;
                            break;
                        case "*":
                            result = operand1 * operand2;
                            break;
                        default:
                            return "Unsupported operator.";
                    }

                    onpStack.push(result.toString());
                } else {
                    return "Incorrect notation.";
                }
            }
        }

        if (onpStack.StackSize() == 1) {
            return onpStack.pop();
        } else {
            while(onpStack.StackSize() > 0){
                onpStack.pop();
            }
            return "Incorrect notation.";
        }
    }

}
