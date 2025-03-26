import java.util.*;
public class UserInputOutput {

    static int fibonacci(int n){
        int a = 0, b = 1;
        for(int i = 1; i <=n; i++){
            int c = a + b;
            a = b;
            b = c;
        }
        return a;
    }
    // 0,1,1,2,3
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // char ch = sc.next().charAt(0);
        // if(ch >= 'A' && ch <= 'Z'){
        //     System.out.println(1);
        // }else if(ch >= 'a' && ch <= 'z'){
        //     System.out.println(0);
        // }else{
        //     System.out.println(-1);
        // }
        // sc.close();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));

    }
}
