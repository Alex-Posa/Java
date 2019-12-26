package arbeitnehmerclone;

public class Department implements Cloneable {
		
		private int id;
		private String name;
		
		Department(int ID, String Name){
			this.id = ID;
			this.name = Name;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		
		public Department clone() {
			try {
				return (Department) super.clone();
			} catch (CloneNotSupportedException e) {
				
			}
			return null;
		}
}
