package repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import model.User;

@Repository("userRepo")
@Transactional
public class UserRepo {
	
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private SessionFactory sesFact;

	public UserRepo() {
	}

	@Autowired
	public UserRepo(SessionFactory sesFact) {
		super();
		this.sesFact = sesFact;
	}
	
	public void insert(User user) {
		
		sesFact.getCurrentSession().save(user);
	}
	
	public void update(User user) {
		sesFact.getCurrentSession().update(user);
	}
	
	public void delete(User user) {
		sesFact.getCurrentSession().delete(user);;
	}
	
	public User selectById(int id) {
		return sesFact.getCurrentSession().get(User.class, id);
	}
	
	public User selectByUsername(String username) {
		List<User> user = sesFact.getCurrentSession().createNativeQuery("select * from"+
				" Users where name='"+username+"'", User.class).list();
		
		if(user.size()==0) {
			return null;
		}
			
		
		
	return	user.get(0);
	}
	

	public List<User> selectAll(){
		return sesFact.getCurrentSession().createQuery("from User", User.class).list();
	}
	

}
