import java.util.Scanner;
public class specWord{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        String p = "";
        int m= 0,k=0,n=0;
        for(int i = 0; i<st1.length(); i++){
            if(st1.charAt(i) == ' ' && k==1){
                k=0;
                p = st1.substring(m,i+1).trim();
                if(p.charAt(0) == p.charAt(p.length()-1))
                 System.out.print(p);
            }
            if(st1.charAt(i) == ' ' && k==0 && i<st1.length()-1){
                m=i; k++;
            }
        }
    }
}