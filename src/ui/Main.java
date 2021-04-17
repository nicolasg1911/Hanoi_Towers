package ui;


import java.util.Scanner;

import model.HanoiTowers;

public class Main {
	private static Scanner sc =new Scanner(System.in);
	private static HanoiTowers HT;
	public static void main(String[] args) {
		HT = new HanoiTowers();
		start();
	}
	
	public static void start() {
		int disksCases = sc.nextInt();
		sc.nextLine();
		int[] disks = new int[disksCases];
		int repeat=0;
		while(repeat<disksCases){
			disks[repeat]=sc.nextInt();
			sc.nextLine();
			repeat++;			
		}
		
		for (int i=0;i<disks.length;i++) {
			String space=" ";
			System.out.println(disks[i]+space+0+space+0);
			HT.setTowers(disks[i]);
			HT.hanoiTowers(disks[i]);	
			System.out.println("");
		}
	}
}


