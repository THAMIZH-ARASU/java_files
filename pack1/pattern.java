package pack1;
public class pattern{
	public void pyramid(int n){
		int m=n;
		int k=1;
		int c=n*2;
		for(int i=0;i<n;i++){
			for (int j=1;j<=m;j++){
				System.out.print(" ");
			}
			m--;
			if(k!=c){
				System.out.print("*");
				k++;
			}
			System.out.println();
		}
	}
	public void triangle(int n){
		for (int i=0;i<n;i++){
			for (int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}