package Assignment;
//1678
public class DoubleReplacement {
    public String interpret(String command) {
        String ans = command.replace("()", "o").replace("(al)", "al");

        return ans;


    }
}
