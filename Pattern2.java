package com.patterns;

import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			for(int j=n;j>0;j--) {
				for(int k=n;k>i;k--) {
					System.out.print(j+" ");
					return;
				}
			}
			System.out.print("$");
		}
		
	}
}
