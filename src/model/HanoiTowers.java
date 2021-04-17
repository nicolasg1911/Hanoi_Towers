package model;

public class HanoiTowers {
	private int tower1;
	private int tower2;
	private int tower3;

	public HanoiTowers() {
		tower1=0;
		tower2=0;
		tower3=0;
	}
	public void hanoiTowers(int n) {
		hanoiTowers(n,"A","B","C");
	}
	
	public void setTowers(int n) {
		tower1=n;
		tower2=0;
		tower3=0;
	}
	
	private void hanoiTowers(int n, String x, String a, String y) {
		String space=" ";	
		if(n==1){	
			hanoiTowers(x,y);
			System.out.println(tower1+space+tower2+space+tower3);
		}else{		
			hanoiTowers(n-1,x,y,a);
			hanoiTowers(x,y);
			System.out.println(tower1+space+tower2+space+tower3);
			hanoiTowers(n-1,a,x,y);
		}
	}
	
	private void hanoiTowers(String x, String y) {
		switch(x) {
		case "A":
			tower1--;
		break;
		case "B":
			tower2--;
		break;	
		case "C":
			tower3--;
		break;
		}
		switch(y) {
		case "A":
			tower1++;
		break;
		case "B":
			tower2++;
		break;
		case "C":
			tower3++;
		break;
		}
	}
}