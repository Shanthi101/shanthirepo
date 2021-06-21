package basics;

public class Variables {
	float f1;
	static short sh;
	

	
	public float div(float x,float y) {
		float d =x/y;
		return d;
		
	}
	public static void main(String[] args) {
//		int a;
//		a = 7;
//		System.out.println(a);
//		
//		int c  = a +2;
//		int d = a -6;
//		
//		System.out.println(c);
//		System.out.println(d);
		
//		char abcde = 'x';
//		System.out.println(abcde);
//		abcde  = 'k';
//		System.out.println(abcde);
//		int abc = 97;
//		System.out.println(abcde);
//		abcde  = (char) (abc + 3);
//		System.out.println(abcde);
//		abcde++;
//		System.out.println(abcde);
//		System.out.println((int)abcde);
//		abcde = 'A';
//		System.out.println(abcde);
//		int char1 = abcde;
//		System.out.println(char1);
		
		Variables var = new Variables();
		
		int sum = var.add(5, 8);
		System.out.println(sum);
		
		float divide=	var.div(20, 6);
		System.out.println(divide);
		
		int abc	=var.add_sub(6,4,2);
		System.out.println(abc);
		
		int result=var.sub(10,5);
		System.out.println(result);
	}

	public int add_sub(int x,int y,int z) {
//		int sum = add(x, y);
//		int sub = sub(add(x, y), z);
		return sub(add(x, y), z);
	}

	public int add(int x, int y) {
		int z = x + y;
		return z;
	}
	
	public int sub(int e,int f) {
		int h=(e-f);
		return h;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
