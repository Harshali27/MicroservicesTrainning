/**
 * 
 */
package com.zensar;

/**
 * @author TRG
 *
 */

interface Employee {
	public void show(int empId);
}

public class EmployeeData {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empName = "HARSHALI";
		Employee e1 = (int empId) -> {
			System.out.println("\n EmployeeName: " + empName + "\n EmployeeId: " + empId);
		};
		e1.show(57818);

	}

}
