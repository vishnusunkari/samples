
public class Test2 {

	public String doIt(int ... b){
		return "b";
	}
	
	public String doIt(int a, int b, int c){
		return "a";
	}

	public static void main(String ... args) {

		//Test2 a = new Test2();
		//System.out.println(a.doIt(4, 5, 6));
		Object[] b = {1, 2, 3};
		Integer[] a= new Integer[3];
		b=a;
		for(int i=0;i<3;i++){
			System.out.println(a[i]);
		}
	}

}
