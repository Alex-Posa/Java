package getraenkeautomat;

public class Flasche {

		private Typ sorte;
		
		public Flasche(Typ sort) {
			this.sorte = sort;
		}
	
		public Typ getSort() {
			return this.sorte;
		}
		
		public String toString() {
			return getSort().getName();
		}
}
