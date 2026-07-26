import java.util.Scanner;
public class doublefreq{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st1 = in.nextLine();
        String st2 = st1.toUpperCase();
        char ch = ' '; int t = 0;
        System.out.println(st2);
        for(int i = 0; i<st1.length()-1; i++){
            if(st2.charAt(i) == st2.charAt(i+1))
                t++;
        }
        System.out.println("frequency " + t);
    }
}