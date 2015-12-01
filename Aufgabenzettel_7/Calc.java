public class Calc {

	private float sum;

	public void add(float argAdd) {
		sum += argAdd;
	}
  public void sub(float argSub){
    sum -= argSub;
  }
  public void mult(float argMult){
    sum *= argMult;
  }
  public void div(float argDiv){
    sum /= argDiv;
  }
  public void setSum(float argSum) {
    sum = argSum;
  }

	public float getSum(){
		return sum;
	}
	public void reset() {
		sum = 0;
	}
}
