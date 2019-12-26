package arbeitnehmerclone;

public class Main {

	public static void main(String[] args) {
			
		Department dpt = new Department(1, "Office");
		Employee emp = new Employee(1, "Dandelion", dpt);
		
		//shallow copy
			System.out.println("+++Shallow Copy+++");
			System.out.println();
			Employee shallowEmp = emp;
			System.out.println(emp.toString());
			System.out.println(emp.getDpt().toString());
			System.out.println(shallowEmp.toString());
			System.out.println(shallowEmp.getDpt().toString());
			System.out.println("- - - - - - - - - - - - - - - -");
			System.out.println();
			
		//deep copy
			System.out.println("+++Deep Copy+++");
			System.out.println();
			Employee deepEmp = emp.clone();
			System.out.println(emp.toString());
			System.out.println(emp.getDpt().toString());
			System.out.println(deepEmp.toString());
			System.out.println(deepEmp.getDpt().toString());
	}

}
