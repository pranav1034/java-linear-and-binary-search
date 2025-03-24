import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(Duplicates(str));

    }
    public static String Duplicates(String str){
        HashSet<Character> set= new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(int i=0;i<str.length();i++){
            if(!set.contains(str.charAt(i))){
                set.add(str.charAt(i));
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
