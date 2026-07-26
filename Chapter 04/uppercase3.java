import java.util.Scanner;
public class uppercase3{
    public static void main(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String st1 = in.nextLine().toUpperCase();
        st1 = " " + st1 + " ";
        String p = "";
        int m= 0,k=0;
        for(int i = 0; i<st1.length(); i++){
            p = "";
            if(st1.charAt(i) == ' ' && k==1){
                k=0;
                p = st1.substring(m,i+1).trim();
                System.out.println(p);
            }
            if(st1.charAt(i) == ' ' && k==0 && i<st1.length()-1){
                m=i; k++;
            }
        }
    }
}