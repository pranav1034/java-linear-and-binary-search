public class ReverseString {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println(reverse(str));
    }
    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.reverse();
        return sb.toString();
    }
}
