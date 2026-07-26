import java.util.Scanner;
public class remove{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a word");
        String st1 = in.nextLine();
        String v = "AEIOUaeiou";
        for(int i = 0; i<st1.length(); i++){
            for(int j = 0; j<v.length(); j++){
                if(st1.charAt(i) == v.charAt(j)){
                    st1 = st1.substring(0,i)+ st1.substring(i+1);
                    i--;
                }
            }
        }
        System.out.println(st1);
    }
}