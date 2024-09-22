package pack1;
public class math{
	public int fact(int n){
		if (n==0){
			return 1;
		}
		else{
			return(n*fact(--n));
		}
	}
	public int square(int n){
		return(n*n);
	}
	public int cube(int n){
		return (n*n*n);
	}
	public int add(int a,int b){
		return a+b;
	}
	public int sub(int a,int b){
		return a-b;
	}
	public int mul(int a,int b){
		return a*b;
	}
	public int div(int a,int b){
		return a/b;
	}
}