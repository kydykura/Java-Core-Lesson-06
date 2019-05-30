package logos.lviv.lgs;

public class WorkerStatic implements Salary{

	public double c;
	
	WorkerStatic(double c){
		this.c=c;
	}
	
	@Override
	public void salary() {
		int priceMonth = 7000;
		double d = c/31*priceMonth;
		setC(d);
		
		
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Salary per month = " + getC() + " UAH";
	}

	
}
