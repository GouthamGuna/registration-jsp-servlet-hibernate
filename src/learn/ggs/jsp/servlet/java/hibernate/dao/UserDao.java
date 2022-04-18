package learn.ggs.jsp.servlet.java.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import learn.ggs.jsp.servlet.java.hibernate.model.User;
import learn.ggs.jsp.servlet.java.hibernate.util.HibernateUtil;

public class UserDao {
	
	/**
	 * Save User
	 * @param user
	 * @return 
	 */
	public void saveUser(User user) {
		Transaction transaction = null;
		try (Session session = HibernateUtil.getSessionFactory().openSession()) {
			// start a transaction
			transaction = session.beginTransaction();
			// save the student object
			session.save(user);
			// commit transaction
			transaction.commit();
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		}
	}

}
