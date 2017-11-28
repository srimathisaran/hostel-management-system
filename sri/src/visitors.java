import javax.persistence.Embeddable;
public class visitors {
	private int visitor_id;
    public String visitor_name;
    public String entry_time;
    public String exit_time;
    public int visitor_phno;
    public String visitor_city;
	public int getVisitor_id() {
		return visitor_id;
	}
	public void setVisitor_id(int visitor_id) {
		this.visitor_id = visitor_id;
	}
	public String getVisitor_name() {
		return visitor_name;
	}
	public void setVisitor_name(String visitor_name) {
		this.visitor_name = visitor_name;
	}
	public String getEntry_time() {
		return entry_time;
	}
	public void setEntry_time(String entry_time) {
		this.entry_time = entry_time;
	}
	public String getExit_time() {
		return exit_time;
	}
	public void setExit_time(String exit_time) {
		this.exit_time = exit_time;
	}
	public int getVisitor_phno() {
		return visitor_phno;
	}
	public void setVisitor_phno(int visitor_phno) {
		this.visitor_phno = visitor_phno;
	}
	public String getVisitor_city() {
		return visitor_city;
	}
	public void setVisitor_city(String visitor_city) {
		this.visitor_city = visitor_city;
	}

}
