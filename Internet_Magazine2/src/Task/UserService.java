

import java.util.ArrayList;
import java.util.List;

public class UserService {

	private List<User> list = new ArrayList<>();
	private static UserService userService;

	private UserService() {
	}

	public static UserService getUserService() {
		if (userService == null) {
			userService = new UserService();
		}
		return userService;
	}

	public List<User> getList() {
		return list;
	}

	public void saveUser(User user) {
		list.add(user);
	}

	public User getUser(String email) {
		return list.stream().filter(user -> user.getEmail().equals(email)).findFirst().get();
	}
}
