package StreamMapCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMapCollectionExample {
	public static void main(String[] args) {
		
		List<User> users = new ArrayList<User>();
		users.add(new User(1, "Hari", "Test@123"));
		users.add(new User(2, "Ram", "Test@123"));
		users.add(new User(3, "Shyam", "Test@123"));
		users.add(new User(4, "Sita", "Test@123"));
		
		
		///tradational
		List<UserDto> usersDto = new ArrayList<UserDto>();
		for(User user : users) {
			usersDto.add(new UserDto(user.getId(), user.getUserName()));
		}
		for(UserDto dto : usersDto) {
			System.out.println(dto);
		}
		
		///using stream().map()
		
		List<UserDto> userDtos = users.stream().map(new Function<User, UserDto>() {

			@Override
			public UserDto apply(User user) {
				return new UserDto(user.getId(), user.getUserName());
			}
		}).collect(Collectors.toList());
		System.out.println(userDtos);
		
		
		///using stream().map() lamba
		
		users.stream().map((User user) -> 
			new UserDto(user.getId(), user.getUserName()))
		.forEach((userdto)->{
			System.out.println(userdto);
		});
		;
		
		
		
		
	}

}

class UserDto{
	private int id;
	private String userName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public UserDto(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}
	@Override
	public String toString() {
		return "UserDto [id=" + id + ", userName=" + userName + "]";
	}
	
	
}

class User{
	private int id;
	private String userName;
	private String password;//we dont want to send password to the user
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User(int id, String userName, String password) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + "]";
	}
	
}
