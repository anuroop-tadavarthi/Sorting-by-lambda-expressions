import java.util.List;

import org.junit.Test;

import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Date;


	/**
	 * Test class to test sorting of Employe object on different parameters.
	 * each test method will test each Comparator implementation.
	 * @author http://javarevisited.blogpot.com
	 */
	public class EmployeTest {
	  
	 
	    @Test
	    public void testEmployeSorting(){
	        Employe e1 = new Employe(23, "Anuroop","t", 1000);
	        Employe e2 = new Employe(23, "BhARATH","B", 2000);
	        Employe e3 = new Employe(23, "Chaitan","C", 3000);
	        Employe e4 = new Employe(23, "Dasa","D", 4000);
	        Employe e5 = new Employe(23, "Eshwar","E", 5000);
	      
	        List<Employe> listOfEmployes = new ArrayList<Employe>();
	        listOfEmployes.add(e1);
	        listOfEmployes.add(e2);
	        listOfEmployes.add(e3);
	        listOfEmployes.add(e4);
	        listOfEmployes.add(e5);
	        System.out.println("sorted List : " +"\n" +"\n"+listOfEmployes+"\n");
	      
	     /*   Collections.sort(listOfEmployes, Employee.);      //Sorting by natural order
	        assertEquals(e1, listOfEmployes.get(0));
	        assertEquals(e5, listOfEmployes.get(4));
	       */ 
	        Collections.sort(listOfEmployes, Employe.AgeComparator);
	        assertEquals(e2, listOfEmployes.get(0));
	        assertEquals(e3, listOfEmployes.get(4));
	      
	        Collections.sort(listOfEmployes, Employe.FristNameComparator);
	        assertEquals(e1, listOfEmployes.get(0));
	        assertEquals(e4, listOfEmployes.get(4));
	     
	        Collections.sort(listOfEmployes, Employe.LastNameComparator);
	        assertEquals(e1, listOfEmployes.get(0));
	        assertEquals(e4, listOfEmployes.get(4));
	      
	        Collections.sort(listOfEmployes, Employe.SalaryComparator);
	        assertEquals(e3, listOfEmployes.get(0));
	        assertEquals(e2, listOfEmployes.get(4));
	      
	    }

		private void assertEquals(Employe e1, Employe employe) {
			// TODO Auto-generated method stub
			
		}
	}