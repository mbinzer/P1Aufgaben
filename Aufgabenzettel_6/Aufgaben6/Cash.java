public class Cash {
	
	private float sum;
	public void add(float getPrice) {
		sum += getPrice;
	}		
	public float getSum(){
		return sum;	
	}
	public void reset() {
		sum = 0;
	}
}

