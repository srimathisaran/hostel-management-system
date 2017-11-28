import javax.persistence.Embeddable;
public class hostel {
	    private String hostel_id;
	    private String hostel_name;
	    public int hostel_capacity;
	    public int hostel_rooms;
	    public String getHostel_id() {
			return hostel_id;
		}
		public void setHostel_id(String hostel_id) {
			this.hostel_id = hostel_id;
		}
		public String getHostel_name() {
			return hostel_name;
		}
		public void setHostel_name(String hostel_name) {
			this.hostel_name = hostel_name;
		}
		public int getHostel_capacity() {
			return hostel_capacity;
		}
		public void setHostel_capacity(int hostel_capacity) {
			this.hostel_capacity = hostel_capacity;
		}
		public int getHostel_rooms() {
			return hostel_rooms;
		}
		public void setHostel_rooms(int hostel_rooms) {
			this.hostel_rooms = hostel_rooms;
		}
		public int getNo_of_employees() {
			return no_of_employees;
		}
		public void setNo_of_employees(int no_of_employees) {
			this.no_of_employees = no_of_employees;
		}
		public String getMess_name() {
			return mess_name;
		}
		public void setMess_name(String mess_name) {
			this.mess_name = mess_name;
		}
		public int getMess_capacity() {
			return mess_capacity;
		}
		public void setMess_capacity(int mess_capacity) {
			this.mess_capacity = mess_capacity;
		}
		public int no_of_employees;
	    public String mess_name;
	    public int mess_capacity;
	    
}
