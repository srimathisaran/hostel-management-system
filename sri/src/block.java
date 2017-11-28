import javax.persistence.Embeddable;
public class block {
	private int block_no;
    private String block_name;
    public int rooms;
	public int getBlock_no() {
		return block_no;
	}
	public void setBlock_no(int block_no) {
		this.block_no = block_no;
	}
	public String getBlock_name() {
		return block_name;
	}
	public void setBlock_name(String block_name) {
		this.block_name = block_name;
	}
	public int getRooms() {
		return rooms;
	}
	public void setRooms(int rooms) {
		this.rooms = rooms;
	}
	
	    
}
