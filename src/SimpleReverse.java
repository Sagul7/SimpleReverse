import java.util.Scanner;

public class SimpleReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(reverse(word));
    }
    public static String reverse(String s)
    {
        String res = "";
        for(int i =s.length()-1;i>=0;i--)
        {
            res+=s.charAt(i);
        }
        return res;
    }
}
