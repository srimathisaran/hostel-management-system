package sri;
import javax.persistence.Embeddable;
public class account {
	    private String name;
	    private int roll_no;
	    public int age;
	    public String sex;
	    public String date_of_birth;
	    public String blood_group;
	    public int aadhar_no;
	    public String address;
	    public String email_id;
	    public String state;
	    public String city;
	    public int pincode;
	    public int phone_no;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getRoll_no() {
			return roll_no;
		}
		public void setRoll_no(int roll_no) {
			this.roll_no = roll_no;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getDate_of_birth() {
			return date_of_birth;
		}
		public void setDate_of_birth(String date_of_birth) {
			this.date_of_birth = date_of_birth;
		}
		public String getBlood_group() {
			return blood_group;
		}
		public void setBlood_group(String blood_group) {
			this.blood_group = blood_group;
		}
		public int getAadhar_no() {
			return aadhar_no;
		}
		public void setAadhar_no(int aadhar_no) {
			this.aadhar_no = aadhar_no;
		}
		public String getAddress() {
			return address;
		}
		public void setAddress(String address) {
			this.address = address;
		}
		public String getEmail_id() {
			return email_id;
		}
		public void setEmail_id(String email_id) {
			this.email_id = email_id;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getCity() {
			return city;
		}
		public void setCity(String city) {
			this.city = city;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		public int getPhone_no() {
			return phone_no;
		}
		public void setPhone_no(int phone_no) {
			this.phone_no = phone_no;
		}
	    
}
