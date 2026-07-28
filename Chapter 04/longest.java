import java.util.Scanner;
public class longest{
    public static void main(){
        Scanner in = new Scanner(System.in);
        String st1 = in.nextLine();
        st1 = " " + st1 + " ";
        String wrd = "";
        int m = 0, l =0, f = 0, t= 0, k=0;
        for(int i = 0; i< st1.length(); i++){
            if(st1.charAt(i) == ' ' && k ==1){ //2 
                if(l< st1.substring(m,i+1).length()){
                    l = st1.substring(m,i+1).length();
                    wrd = st1.substring(m,i+1);
                }
                k--;
            }
            if(st1.charAt(i) == ' ' && k ==0 && i < st1.length()-1){
                m = i;
                k++;
            }
        }
        
            System.out.println(wrd);
    }
}
