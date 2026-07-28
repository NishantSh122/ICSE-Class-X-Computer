import java.util.Scanner;
public class palinString{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        String p = "";
        String rev = "";
        int m= 0,k=0,n=0;
        for(int i = 0; i<st1.length(); i++){
            if(st1.charAt(i) == ' ' && k==1){
                n=0;
                k=0;
                p = st1.substring(m,i+1).trim();
                for(int d = p.length()-1; d <=0; d--)
                    rev += p.charAt(d);
                if(rev.equalsIgnoreCase(p))
                 System.out.print(p);
            }
            if(st1.charAt(i) == ' ' && k==0 && i<st1.length()-1){
                m=i; k++;
            }
        }
    }
}