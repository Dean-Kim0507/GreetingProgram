package hello;
import java.util.*;

class Person{
	private String name;
	private String number;
	private String job;
	private String email;
	Person(String n, String u, String j, String e){
		this.name = n;
		this.number = u;
		this.job = j;
		this.email = e;	
	}
	public String toString()
	{
	      String str;

	      str = String.format("name : %s\n", this.name);
	      str += String.format("number : %s\n", this.number);
	      str += String.format("email : %s\n", this.email);
	      str += String.format("job : %s", this.job);

	      return str;
	}
	public String getName() {
		return name;
	}
	}

class PhoneBook5 extends Person {
	PhoneBook5(String name, String number, String job, String email){
	super(name, number, job, email);
	}
    
	private ArrayList<Person> pb = new ArrayList<Person>();
    void add(String name, String number, String job, String email){
    	Person p1 = new Person(name, number, job, email);
    	pb.add(p1);
    }
    void del(String i) {
    	for (int o = 0; o < pb.size(); o++) {
    		Person name = pb.get(o);
    		if (name.getName().equals(i)) {
    			pb.remove(o);
    			System.out.println("Delete Success");	
    		}
    		else if (o == pb.size()-1) {
    			System.out.println("Can not find it");
    		}
    	}
    }
    void search(String m) {
    	for (int n = 0; n < pb.size(); n++) {
    		Person name = pb.get(n);
    		if (name.getName().equals(m)) {
    			System.out.println(m+" is at " + n);
    		}
    		else if (n == pb.size()-1) {
    			System.out.println("Can not find it");
    		}
    	}
	
    }
    
    void print () {
    	System.out.println(pb);
    }
    }



public class phoneBook4 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String name=null, number = null, email=null, job=null;
	PhoneBook5 pd = new PhoneBook5(name, number, email, job);
	System.out.println("This is my phone book program");
	while (true) {
		int menu;
		System.out.println("\n------------------------");
		System.out.println("1. Add person");
		System.out.println("2. Del person");
		System.out.println("3. Search person");
		System.out.println("4. Print PhoneBook");
		System.out.println("5. Exit");
		System.out.print("Select the number : ");
		menu = scan.nextInt();
		switch(menu) {
			case 1: 
				System.out.print(" Enter the name  : "); name = scan.next();
				System.out.print(" Enter the number: "); number = scan.next();
				System.out.print(" Enter the email : "); email = scan.next();
				System.out.print(" Enter the job   : "); job = scan.next();
				pd.add(name, number, email, job);
				break;
			case 2:
				System.out.print(" Enter the name: ");
				pd.del(scan.next());
				break;
			case 3:
				System.out.print(" Enter the name: ");
				pd.search(scan.next());
				break;
			case 4:
				pd.print();
				break;
			case 5:
				System.exit(0);
				break;
		}
	}
	
}
}

