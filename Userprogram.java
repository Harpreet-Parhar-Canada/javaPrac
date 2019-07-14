public class Userprogram implements Observer {
	private String user1;
	private String user2;
	private Subject obj;
	public Userprogram(Subject obj)	{
		this.obj=obj;
		obj.register(this);
	}
	public void update(String user1,String user2) {
		this.user1 = user1;
		this.user2 =user2;
		printingNames();
	}
	public void printingNames() {
		System.out.println("First user"+user1+"Second User"+user2+" ");
	}

}