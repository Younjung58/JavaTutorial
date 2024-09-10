package _01Array;

public class test02 {
	public static void main(String[] args) {
		// 문제 1
		int [] a = {30,40,50,60,55};
		System.out.println(a[0]+","+a[1]+","+a[2]+","+a[3]+","+a[4]);
		// 문제 2
		String [] b = new String[3];
		b[0]="kim";
		b[1]="lee";
		b[2]="park";
		System.out.println(b[0]+" "+b[1]+" "+b[2] );
		// 문제 3
		int [] lotto = {6,12,33,4,5,26};
		System.out.println("{"+lotto[0]+","+ lotto[1]+","+(lotto[2]+2)+","+lotto[3]+","+lotto[4]+","+lotto[5]+"}");
		// 문제 4
		System.out.println(lotto[0]+lotto[2]+lotto[4]);
		// 문제 5
		lotto[1]+=lotto[0];
		lotto[2]+=lotto[1];
		lotto[3]+=lotto[2];
		lotto[4]+=lotto[3];
		lotto[5]+=lotto[4];
		System.out.println("{"+lotto[0]+","+ lotto[1]+","+lotto[2]+","+lotto[3]+","+lotto[4]+","+lotto[5]+"}" );
		// 문제 6
		int [] lotto2 = {6,12,33,4,5,26};
		System.out.println((lotto2[3]%2)!=0);
		// 문제 7
		int money = 2750;
		int pay = 10000;
		int payback = pay-money;
		int [] payback2 = {payback/1000,(payback%1000)/100, (payback%100)/10};
		System.out.println("천원"+payback2[0]+"개, 백원"+payback2[1]+"개, 십원"+payback2[2]+"개");
		// 문제 8
		int [] A = {700,500};
		int [] B = {900,300};
		int [] C = {650,150};
		System.out.println(((C[0]>=A[0])&&((C[1]-3)>=B[1]))&&(((C[0]+3)<=B[0])&&C[1]<=A[1]));
	}
}
