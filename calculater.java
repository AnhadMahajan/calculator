package projects;

import java.util.Scanner;

public class calculater {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        {   int ans=0;
            while (true) {
                System.out.println("enter the operator");
                char op = in.next().trim().charAt(0); 
                if(op=='+'|| op=='-'|| op=='*'|| op=='/'|| op=='%'){
                    System.out.println("enter 2 numbers");
                    int num1 = in.nextInt();
                    int num2 = in.nextInt();
                   
                    System.out.println();
                    if(op=='+'){
                        ans=num1+num2;
                    }
                    if(op=='-'){
                        ans=num1-num2;
                    }
                    if(op=='*'){
                        ans=num1*num2;
                    }
                    if(op=='/'){
                        ans=num1/num2;
                    }
                    if(op=='%'){
                        ans=num1%num2;
                    }
                     
                }else if(op=='x'){
                    System.out.println("invalid");
                    break;
                }
                System.out.println(ans);
                
            }
        }
    }
    
}
