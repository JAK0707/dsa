import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println('a'+1);
        System.out.println((char)('a'+1));
        System.out.println("a"+"1");
        System.out.println("a"+1);
        //this is same as ("a" + "1")
        //integer will be converted to Integer that will call toString()
        //any object in java with existing string will call toString() and will be converted to string
        System.out.println("Jai" + new ArrayList<>());
        //System.out.println("Jai" + new int[5]);
        String a = "jai";
        String b = "ho";
        String c = a+b;
        System.out.println(c);
    }
}
