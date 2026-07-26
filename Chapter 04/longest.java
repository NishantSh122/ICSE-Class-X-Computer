import java.util.Scanner;
public class longest{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        int m = 0, l =0, f = 0, t= 0, k=0;
        for(int i = 0; i< st1.length(); i++){
            if(st1.charAt(i) == ' ' && k ==1){ //2 
                if(l> st1.substring(m,i+1).length())
                    k--;
                else{
                    k--;
                    l = st1.substring(m,i+1).length();
                    f = m;
                    t = i+1;
                }
            }
            if(st1.charAt(i) == ' ' && k ==0 && i < st1.length()-1){
                m = i; //0
                k++;
            }
        }
        
            System.out.println(st1.substring(f,t).trim());
    }
}
