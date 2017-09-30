import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c=scn.nextInt();
        System.out.println(Math.round(c*9/5f+32));
        String str=scn.nextLine();
        char ch=',';
        System.out.println(str.replace( ',','\n'));
        System.out.println(str.toLowerCase());






    }
}
