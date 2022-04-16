package com.bridgelabz;

public class AddressBook {
	
	  public String firstName;
	    public String lastName;
	    public long phoneNumber;
	    public String emailId;
	    public String address;
	    public String city;
	    public String state;
	    public int pincode;

	    public void Printing(){
	        System.out.println();
	    }

	    public AddressBook(String firstName, String lastName, long phoneNumber,
	                   String emailId, String address, String city, String state, int pincode) {
	        super();
	        this.firstName = firstName;
	        this.lastName = lastName;
	        this.phoneNumber = phoneNumber;
	        this.emailId = emailId;
	        this.address = address;
	        this.city = city;
	        this.state = state;
	        this.pincode = pincode;
	    }


		public static void main(String[] args) {
			AddressBook Book = new AddressBook("Jeevarathinam", "R", 887656, "jeeva@gmail.com", "Namakkal", "Salem","TamilNadu", 637207 );
			System.out.println(Book.firstName+"" + Book.lastName+"\n" + Book.phoneNumber+"\n" + Book.emailId+"\n" + Book.address+"\n" + Book.city+"\n" + Book.state+"\n" + Book.pincode);
		}
	}	
