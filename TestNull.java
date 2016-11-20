package com.npe;
import java.util.ArrayList;
import java.util.List;

class TestNull
{
	public static void main(String abc[])
	{
		Employee emp = new Employee();
		List<Employee> empl = emp.empName();
		// Empty List
		for (Employee ep : empl) // Throw NPE and stop the flow.
		{
			System.out.println(ep.toString());
		}
		System.out.println("Clean NPE");
	}
}

class Employee
{
	List empName = new ArrayList();

	public List<Employee> empName()
	{
		return null;
	}

}