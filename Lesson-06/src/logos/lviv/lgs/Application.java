package logos.lviv.lgs;

public class Application {

	public static void main(String[] args) {
		
		WorkerDynamic wd = new WorkerDynamic(4);
		wd.salary();
		System.out.println(wd);
		
		WorkerStatic  ws = new WorkerStatic(35);
		ws.salary();
		System.out.println(ws);
	}

}
