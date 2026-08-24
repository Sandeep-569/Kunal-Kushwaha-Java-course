import java.util.*;
public class Ex04_BasicCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.print("Enter the operator: ");
            char op = sc.next().trim().charAt(0);
            if(op=='+' || op=='%' || op=='*' || op=='-' || op=='/' ){
                System.out.print("Enter two number: ");
                int a = sc.nextInt(), b = sc.nextInt();
                if(op=='+'){
                    ans = a+b;
                }
                if(op=='-'){
                    ans = a-b;
                }
                if(op=='*'){
                    ans = a*b;
                }
                if(op=='/'){
                    ans = a/b;
                }
                if(op=='%'){
                    ans = a%b;
                }
                System.out.println(ans);
            }else if(op == 'X' || op == 'x'){
                break;
            }else{
                System.out.println("Enter the valid operation!!");
            }

        }
    }
}
