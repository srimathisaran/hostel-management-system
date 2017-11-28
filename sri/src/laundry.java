import javax.persistence.Embeddable;
public class laundry {
	    private int student_id;
	    private int no_of_dresses;
	    public String pickup_date;
	    public String delivery_date;
		public int getStudent_id() {
			return student_id;
		}
		public void setStudent_id(int student_id) {
			this.student_id = student_id;
		}
		public int getNo_of_dresses() {
			return no_of_dresses;
		}
		public void setNo_of_dresses(int no_of_dresses) {
			this.no_of_dresses = no_of_dresses;
		}
		public String getPickup_date() {
			return pickup_date;
		}
		public void setPickup_date(String pickup_date) {
			this.pickup_date = pickup_date;
		}
		public String getDelivery_date() {
			return delivery_date;
		}
		public void setDelivery_date(String delivery_date) {
			this.delivery_date = delivery_date;
		}

}
