package LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String name="asim";
        char target ='s';
        boolean ans = search(name,target);
        System.out.println(ans);
    }
    static boolean search(String str, char target){
        if (str.isEmpty()){
            return false;
        }

//        for (int i = 0; i < str.length(); i++) {
//            if(target==str.charAt(i));{
//                return true;
//            }
//        }
        // for each
        for (char ch : str.toCharArray()){
            if (ch == target){
                return true;
            }
        }
        return false;
    }
}
