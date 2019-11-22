package emailapp;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private String alternateEmail; 
	
//	 Constructor reiceve first and lastname
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Email created for " + this.firstName + " " + this.lastName);
		
//		Call method asking for department
		this.department = setDepartment();
		System.out.println("Department : " + this.department);
	}
	
//	Generate a random password
	
//	Set the mailbox capacity
	
//	Set the alternate email
	
//	Change the password
}
