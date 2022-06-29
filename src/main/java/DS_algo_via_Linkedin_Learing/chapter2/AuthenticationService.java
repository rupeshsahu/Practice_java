package DS_algo_via_Linkedin_Learing.chapter2;

public class AuthenticationService {
	
	UserDao dao = new UserDaoImpl();
	
	public boolean login(String email, String password) {
		User user = dao.findUserByEmail(email);
		// check passwords...
		return true;
	}

	public UserDao getUserDao() {
		return dao;
	}

	public void setUserDao(UserDao dao) {
		this.dao = dao;
	}
	
	

}
