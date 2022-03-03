package com.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int i,j,p;
        p = N/2;
        //EVEN
        if(N%2 == 0){
            for(i=1;i<=p;i++){
                for(j=1;j<=p;j++){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    } 
                }
                for(j=p;j>=1;j--){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            for(i=p;i>=1;i--){
                for(j=1;j<=p;j++){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(j=p;j>=1;j--){
                     if(j<=i){
                        System.out.print("*");
                     }
                     else{
                        System.out.print(" ");
                     }
                }
                System.out.println();
            }
            
        }
        
        //ODD
        else{
            for(i=1;i<=p+1;i++){
                for(j=1;j<=p+1;j++){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    } 
                }
                for(j=p;j>=1;j--){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
            
            for(i=p;i>=1;i--){
                for(j=1;j<=p+1;j++){
                    if(j<=i){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                for(j=p;j>=1;j--){
                     if(j<=i){
                        System.out.print("*");
                     }
                     else{
                        System.out.print(" ");
                     }
                }
                System.out.println();
            }
            
        }
    }
}


