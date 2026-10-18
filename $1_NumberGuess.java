import java.util.Random;
import java.util.Scanner;

public class $1_NumberGuess {
    public static void main(String[] a){
        Scanner s=new Scanner(System.in);
        int target=new Random().nextInt(100)+1,
        tries=0;
        System.out.println("Guess 1-100");

        while(true){
        int g=s.nextInt();
        tries++;
        if(g==target)
        {
            System.out.println("Correct in "+tries+" tries");break;}
            System.out.println(g<target?"Higher":"Lower");
    }
    }

}
