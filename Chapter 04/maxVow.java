
import java.util.Scanner;
public class maxVow {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        String wrd = "";
        String vw = "AEIOUaeiou";
        int m = 0, C = 0,k = 0, vl = 0;
        for (int i = 0; i < st1.length(); i++) {
            String p;
            if (st1.charAt(i) == ' ' && k == 1) {
                p = st1.substring(m, i + 1);
                for (int x = 0; x < p.length(); x++) 
                    for (int y = 0; y < vw.length(); y++) 
                        C = (p.charAt(x) == vw.charAt(y)) ? ++C : C;
                if (vl < C) {
                    vl = C;
                    wrd = p;
                }
                k--;
                C=0;
            }
            if (st1.charAt(i) == ' ' && k == 0 && i < st1.length() - 1) {
                k++;
                m=i;
            }
        }
    System.out.println(wrd);
    }
}