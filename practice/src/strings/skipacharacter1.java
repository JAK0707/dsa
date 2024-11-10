package strings;

public class skipacharacter1 {
    public static void main(String[] args) {
        String s = "bacced";
        char target = 'a';

        //this will print the string with the character removed
        System.out.println(skip(s,target));

        //this will still print the old string as strings are immutable in java
        System.out.println(s);
    }
    static String skip(String s,char target){
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=target){
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
