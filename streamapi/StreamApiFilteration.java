package com.corejava.streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;



/**  This method will filter the data using stream API.
 * in below example it will filter the data for HR and MECH dept.
 * @author Manoj Cheulwar
 *
 */
public class StreamApiFilteration {

	public static void main(String args[]) {
		Employee e = new Employee("manoj", "HR");
		Employee e1 = new Employee("Suresh", "IT");
		Employee e2 = new Employee("Ganesh", "MECH");
		Employee e3 = new Employee("Sam", "FINTECH");
		Employee e4 = new Employee("Rahul", "HR");

		List<Employee> list = new ArrayList();
		Stream<Employee> empStream = list.stream();
		List<Employee> fliterList = new ArrayList();

		list.add(e);
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);

		Stream<Employee> hrfliterList = empStream.filter((emp) -> emp.getDept().equalsIgnoreCase("HR"));

		Stream<Employee> mechFilterList = list.stream().filter((emp) -> emp.getDept().equalsIgnoreCase("MECH"));

		hrfliterList.forEach((emp1) -> System.out.println(emp1.toString()));

		mechFilterList.forEach((emp2) -> System.out.println(emp2.toString()));
	}

}
