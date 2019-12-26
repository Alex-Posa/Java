package arbeitnehmerclone;

public class Employee implements Cloneable {
		
		private int employeeId;
		private String name;
		private Department dpt;
		
		Employee(int ID, String Name, Department DPT){
			this.employeeId = ID;
			this.name = Name;
			this.dpt = DPT;
		}

		public int getEmployeeId() {
			return employeeId;
		}

		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Department getDpt() {
			return dpt;
		}

		public void setDpt(Department dpt) {
			this.dpt = dpt;
		}
		
		public Employee clone() {
			try {
				Employee copy = (Employee) super.clone();
				copy.dpt = (Department)copy.dpt.clone();
				return copy;
			} catch(CloneNotSupportedException e) {
				
			}
			return null;
			
		}
		
}
