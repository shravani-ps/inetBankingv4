package javaconcepts;

public class twodimarray {

	public static void main(String[] args) {
		//int a[][]= new int[3][2];
		int a[][]= {{1,2},{3,4},{5,6}};
		/*a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;*/
		/*for(int i=0;i<=2;i++) {
			for(int j=0;j<=1;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}*/
		for(int i[]:a) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
				