package basics;

public class Flat {
	String flatOwner;
	double flatRent;
	int flatMembers;
	
	public void addMember() {
		flatMembers = flatMembers + 1;
//		flatMembers++;
	}
	
	public void deleteMember() {
		flatMembers--;
	}
	
	public void cleanFlat() {
		System.out.println("Flat has been cleaned for "+flatOwner);
	}
	
	public Flat(String flatOwner, double flatRent, int flatMembers) {
		this.flatOwner = flatOwner;
		this.flatRent = flatRent;
		this.flatMembers = flatMembers;
	}
	
	public static void main(String[] args) {
		Flat f1 = new Flat("Tom", 1800, 4);
//		f1.flatOwner = "Tom";
//		f1.flatRent = 1800;
//		f1.flatMembers = 4;
		System.out.println(f1.flatOwner);
		System.out.println(f1.flatRent);
		System.out.println(f1.flatMembers);
//		f1.cleanFlat();

//		Flat f2  = new Flat();
//		f2.flatOwner = "Geetha";
//		f2.flatRent = 2800;
//		f2.flatMembers = 7;
//		System.out.println(f2.flatOwner);
//		System.out.println(f2.flatRent);
//		System.out.println(f2.flatMembers);
//		f2.addMember();
//		System.out.println(f2.flatMembers);
//		
//		Flat f3  = new Flat();
//		f3.flatOwner = "Praveen";
//		f3.flatRent = 800.99;
//		f3.flatMembers = 2;
//		System.out.println(f3.flatOwner);
//		System.out.println(f3.flatRent);
//		System.out.println(f3.flatMembers);
//		f2.addMember();
//		f2.deleteMember();
//		f1.addMember();
//		System.out.println(f2.flatMembers);
//		System.out.println(f1.flatMembers);
	}
}
