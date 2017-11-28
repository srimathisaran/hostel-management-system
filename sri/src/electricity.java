import javax.persistence.Embeddable;
public class electricity {
	    public int unit;
	    private int meter;
	    public float amount_per_meter;
	    public float total_amount;
		public int getUnit() {
			return unit;
		}
		public void setUnit(int unit) {
			this.unit = unit;
		}
		public int getMeter() {
			return meter;
		}
		public void setMeter(int meter) {
			this.meter = meter;
		}
		public float getAmount_per_meter() {
			return amount_per_meter;
		}
		public void setAmount_per_meter(float amount_per_meter) {
			this.amount_per_meter = amount_per_meter;
		}
		public float getTotal_amount() {
			return total_amount;
		}
		public void setTotal_amount(float total_amount) {
			this.total_amount = total_amount;
		}

}
