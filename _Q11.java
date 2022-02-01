
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        for (int i =0; i<n; i++)
        {
            for (int j=0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


//2nd part
public class Q11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=1;
        for (int i =0; i<n; i++)
        {
            for (int j=0; j<n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=0; j<2*i-1; j++){
                System.out.print(k);
                k++;
            }
            System.out.println("");
        }
    }
}

//3rd part
public class Q11_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=1;
        for (int i =0; i<n; i++)
        {
            for (int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }
            for (int j=1; j<=2*i-1; j++){
                System.out.print(j);
                k++;
            }
            System.out.println("");
        }
    }
}
