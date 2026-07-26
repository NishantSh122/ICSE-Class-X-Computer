import java.util.Scanner;
public class Aword{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        String p = "";
        String v = "Aa";
        int m= 0, f=0,k=0,o=0;
        for(int i = 0; i<st1.length(); i++){
            p = "";
            if(st1.charAt(i) == ' ' && k==1){
                k=0;
                p = st1.substring(m,i+1).trim();
                for(int d = 0; d <p.length(); d++)
                    for(int x = 0; x<v.length();x++)
                        if(p.charAt(d) == v.charAt(x))
                            o++;  
                if(o>0){
                 System.out.print(p + " ");
                 o=0;
                }
            }
            if(st1.charAt(i) == ' ' && k==0 && i<st1.length()-1){
                m=i; k++;
            }
        }
    }
}