

/**
 * @author masha
 * @version 1.0
 * @created 03-дек.-2021 18:02:23
 */
public class User {

	private String email;
	private Long id;
	private boolean isActive;
	private String name;
	private String passwordHash;
	private Role role;
	public Role m_Role;
	public UserRepository m_UserRepository;

	public User(){

	}

	public void finalize() throws Throwable {

	}
}//end User