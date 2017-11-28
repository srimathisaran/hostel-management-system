package sri;
import javax.persistence.Embeddable;
/**
 * @author students
 *
 */
public class student {
    private String student_id;
    private String student_name;
    public String student_course;
    public String student_dept;
    public int year;
    public String email_id;
    public int phone_no;
	public String getStudent_id() {
		return student_id;
	}
	public void setStudent_id(String student_id) {
		this.student_id = student_id;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public String getStudent_course() {
		return student_course;
	}
	public void setStudent_course(String student_course) {
		this.student_course = student_course;
	}
	public String getStudent_dept() {
		return student_dept;
	}
	public void setStudent_dept(String student_dept) {
		this.student_dept = student_dept;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public int getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(int phone_no) {
		this.phone_no = phone_no;
	}
    
}