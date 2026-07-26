import java.util.Scanner;
public class NewWord{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two words of same length");
        String st1 = in.nextLine();
        String st = in.nextLine();
        String st2 = "";
        for(int i = 0; i<st1.length(); i++){
            if(i%2 == 0)
                st2 = st2 + Character.toUpperCase(st1.charAt(i));
            else 
                st2 = st2 + Character.toUpperCase(st.charAt(i));
        }
        System.out.println(st2);
    }
}