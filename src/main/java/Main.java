import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int count=0;
        double j=0;
        while (true){
            int i = scan.nextInt();
            if(i== -1){break;}
            j=j+i;
            count++;
        }
        System.out.println(j/count);
    }
}
