package strings;

public class skipastring {
    public static void main(String[] args) {
        String s = "baldevapplebhalu";
        System.out.println(ss(s));
    }
    static String ss(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return ss(s.substring(5));
        }
        else{
            return s.charAt(0)+ss(s.substring(1));
        }
    }
}
