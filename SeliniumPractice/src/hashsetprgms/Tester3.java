package hashsetprgms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Tester3 {

	public static void main(String[] args) {
		List<hashcode1> userList = new ArrayList<hashcode1>();
		userList.add(new hashcode1(1001, "Mike", "Mike@example.com"));
		userList.add(new hashcode1(1002, "Ben", "User@example.com"));
		userList.add(new hashcode1(1003, "Henry", "Henry@example.com"));
		userList.add(new hashcode1(1004, "Hannah", "User@example.com"));
		userList.add(new hashcode1(1005, "Ellie", "Henry@example.com"));
		userList.add(new hashcode1(1006, "Ryan", "Ryan@example.com"));

		Set<hashcode1> userSet = new HashSet<hashcode1>();
		userSet.addAll(userList);
		for (hashcode1 user : userSet)
			System.out.println(user);

	}

}
class hashcode1{
	private int userId;
	private String userName;
	private String emailId;

	public hashcode1(int userId, String userName, String emailId) {
		this.userId = userId;
		this.userName = userName;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public boolean equals(Object user) {
		hashcode1 otherUser = (hashcode1) user;
		if (this.emailId.equals(otherUser.emailId))
			return true;
		return false;
	}

	@Override
	public int hashCode() {
		return emailId.hashCode();
	}
	
	@Override
	public String toString() {
		return "User Name: "+userName + ", Email Id: " + emailId;
	}
}


