import javax.persistence.Embeddable;
public class employee {
	private int emp_id;
    private String emp_name;
    public String designation;
    public String city;
    public int Emp_phno;
    public float emp_salary;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getEmp_phno() {
		return Emp_phno;
	}
	public void setEmp_phno(int emp_phno) {
		Emp_phno = emp_phno;
	}
	public float getEmp_salary() {
		return emp_salary;
	}
	public void setEmp_salary(float emp_salary) {
		this.emp_salary = emp_salary;
	}

}
