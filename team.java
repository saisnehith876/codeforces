import java.util.*;

public class team{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count =0;

        for(int i=0;i<n;i++){
            int t = sc.nextInt();
            int v = sc.nextInt();
            int p = sc.nextInt();

            if(t+v+p>=2) count++;
        }
        System.out.println(count);
        sc.close();
    }
}