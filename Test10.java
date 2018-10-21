package kgc.Test;

public class Test10 {
	//输出数字三角形
	public static void main(String[] args) {
		int n = 8;
		for(int i=0;i<=n;i++) {
			for(int j=0; j<=n-i ; j++) {
				System.out.print(" ");
			}
			for(int k=0;k<2*i+1;k++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}

}
