import java.util.Scanner;
public class replace{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        String v = "AEIOUaeiou";
        for(int i = 0; i<st1.length(); i++){
            for(int j = 0; j<v.length(); j++){
                if(st1.charAt(i) == v.charAt(j))
                    st1 = st1.replace(st1.charAt(i),'*');
            }
        }
        System.out.println(st1);
    }
}