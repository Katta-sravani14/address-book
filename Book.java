package com.katta;
	import java.util.Hashtable;
	import java.util.Map;
	import java.util.Scanner;

	 public class Book {
		Scanner sc = new Scanner(System.in);

		 int id;
		 String fsname = "";
		 String lname = "";
		 String city = "";
		 String state = "";
		 String zip_code = "";
		 String phone_no = "";
		 String email = "";


		public Book(int id, String fsname, String lname, String city, String state, String zip_code, String phone_no,
				String email) {
			super();
			// this.sc = sc;
			this.id = id;
			this.fsname = fsname;
			this.lname = lname;
			this.city = city;
			this.state = state;
			this.zip_code = zip_code;
			this.phone_no = phone_no;
			this.email = email;
		}

		public Book() {

		}



		public Scanner getSc() {
			return sc;
		}

		public void setSc(Scanner sc) {
			this.sc = sc;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getFsname() {
			return fsname;
		}

		public void setFsname(String fsname) {
			this.fsname = fsname;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public String getState() {
			return state;
		}

		public void setState(String state) {
			this.state = state;
		}

		public String getZip_code() {
			return zip_code;
		}

		public void setZip_code(String zip_code) {
			this.zip_code = zip_code;
		}

		public String getPhone_no() {
			return phone_no;
		}

		public void setPhone_no(String phone_no) {
			this.phone_no = phone_no;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		@Override
		public String toString() {
			return "Book [ id=" + id + ", fsname=" + fsname + ", lname=" + lname + ", city=" + city + ", state=" + state
					+ ", zip_code=" + zip_code + ", phone_no=" + phone_no + ", email=" + email + "]";
		}

	}

	 class AdressUc1 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Map<Integer, Book> store = new Hashtable<Integer, Book>();
			Book b11 = new Book(1, "krishna", "kumari", "dknl", "odisha", "75433", "98989898", "dg@we");
			Book b12 = new Book(2, "krishna11", "kumari11", "dknl11", "odisha11", "7543311", "9898989811", "dg@we11");
			store.put(1, b11);
			store.put(2, b12);
			for (Map.Entry<Integer, Book> e1 : store.entrySet()) {
				int key = e1.getKey();
				Book b = e1.getValue();
				System.out.println(key + " contact details are:");
				System.out.println(b.id + " " + b.fsname + " " + b.lname + " " + b.city + " " + b.state + " " + b.zip_code
						+ " " + b.phone_no + " " + b.email + " ");

			}

		}

	}


