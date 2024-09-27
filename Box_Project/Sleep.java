package Box_Project;

public class Sleep {
	Thread a = new Thread();
	public void Sleep() {
		// TODO Auto-generated constructor stub
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
