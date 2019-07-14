import java.util.ArrayList;

public class User implements Subject {
	private ArrayList<Observer> users;
	private String user1;
	private String user2;
	public User() {
		users = new ArrayList<Observer>();
	}
	public void register(Observer addUser) {
		users.add(addUser);
	}
	public void unregister(Observer deleteUser) {
		int index = users.indexOf(deleteUser);
		System.out.println(index);
		users.remove(index);
	}
	public void notifyObserver() {
		for(Observer observers:users) {
			observers.update(user1,user2);
		}
	}
	public void setName1(String newUser) {
		this.user1 = newUser;
		notifyObserver();
	}
	public void setName2(String newUser) {
		this.user2 = newUser;
		notifyObserver();
	}
	
	
}