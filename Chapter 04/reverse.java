import java.util.Scanner;
public class reverse{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        String p = "";
        int m= 0,f=0,k=0;
        for(int i = st1.length()-1; i>=0; i--){
            p = "";
            if(st1.charAt(i) == ' ' && k==1){
                k=0;
                p = st1.substring(i+1,m).trim();
                System.out.print(p + " ");
            }
            if(st1.charAt(i) == ' ' && k==0 && i<st1.length()){
                m=i; k++;
            }
        }
    }
}