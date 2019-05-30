package logos.lviv.lgs;

public class WorkerDynamic implements Salary {

	public int a;
	
	WorkerDynamic(int a){
		this.a=a;
	};
	
	
	@Override
	public void salary() {
		int priceHour = 200;
		int b = a*8*priceHour;
		setA(b);
		
	}


	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	@Override
	public String toString() {
		return "Salary per month = " + getA() + " UAH";
	}

	
}
