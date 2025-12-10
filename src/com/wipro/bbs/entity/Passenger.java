package com.wipro.bbs.entity;

public class Passenger {
		private String passengerId;
		private String name;
	    private String contactNumber;
	    public Passenger(String passengerId, String name, String contactNumber) {
			super();
			this.passengerId = passengerId;
			this.name = name;
			this.contactNumber = contactNumber;
		}
		public String getPassengerId() {
			return passengerId;
		}
		public void setPassengerId(String passengerId) {
			this.passengerId = passengerId;
		}

		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getContactNumber() {
			return contactNumber;
		}
		public void setContactNumber(String contactNumber) {
			this.contactNumber = contactNumber;
		}
		 @Override
		 public String toString() {
				return "Passenger [passengerId=" + passengerId + ", name=" + name + ", contactNumber=" + contactNumber + "]";
			}
	     
	    
}
