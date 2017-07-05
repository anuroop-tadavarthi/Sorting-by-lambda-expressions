    import java.util.Comparator;
	import java.util.Date;

	public class Employe implements Comparable<Employe>{
	    private int age;
		private String firstname;
	    private String lastname;
	    private int salary;

	  
	    public static final Comparator<Employe> AgeComparator = new Comparator<Employe>(){

	        @Override
	        public int compare(Employe o1, Employe o2) {
	            return o1.age - o2.age;  // This will work because age is positive integer
	        }
	      
	    };
	  
	    public static final Comparator<Employe> FristNameComparator = new Comparator<Employe>(){

	        @Override
	        public int compare(Employe o1, Employe o2) {
	            return o1.firstname.compareTo(o2.firstname);
	        }
	      
	    };
	  
	    public static final Comparator<Employe> LastNameComparator = new Comparator<Employe>(){

	        @Override
	        public int compare(Employe o1, Employe o2) {
	        	return o1.lastname.compareTo(o2.lastname);
	        }
	      
	    };
	    
	    public static final Comparator<Employe> SalaryComparator = new Comparator<Employe>(){

	        @Override
	        public int compare(Employe o1, Employe o2) {
	            return o1.salary - o2.salary; // salary is also positive integer
	        }
	      
	    };

	    public Employe(int age, String firstname,String lastname, int salary) {
	    	this.age = age;
	        this.firstname = firstname;
	        this.lastname = lastname;
	        this.salary = salary;
	       
	    }

	    @Override
	    public String toString() {
	   // return "Employe{" + " age=", firstname=" + firstname + ", lastname=" + lastname +", salary=" + salary + "}';
	    return "Employee{" + "age=" + age + ", firstname=" + firstname + ",lastname=" + lastname + ", salary=" + salary; };
	    

	    @Override
	    public int compareTo(Employe o) {
	        return this.age - o.age;
	    }

	    @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	      
	        if ((this.firstname == null) ? (other.firstname != null) : !this.firstname.equals(other.firstname)) {
	            return false;
	        }
	        if ((this.lastname == null) ? (other.lastname != null) : !this.lastname.equals(other.lastname)) {
	            return false;
	        }
	        if (this.salary != other.salary) {
	            return false;
	        }	   
	        return true;
	    }

	    @Override
	    public int hashCode() {
	        int hash = 5;
	        hash = 47 * hash + this.age;
	        hash = 47 * hash + (this.firstname != null ? this.firstname.hashCode() : 0);
	        hash = 47 * hash + (this.lastname != null ? this.lastname.hashCode() : 0);
	        hash = 47 * hash + this.salary;
	        return hash;
	    }

	}

