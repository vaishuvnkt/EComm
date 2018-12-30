package model.daoimpl;

import org.hibernate.Session;

import model.config.HibernateUtil;
import model.dao.ICategoryDAO;
import model.entity.Category;

public class CategoryDAOImpl implements ICategoryDAO{


	private Session sess;
	public CategoryDAOImpl()
	{
		sess = HibernateUtil.getSessionFactory().openSession();
	}
	
	public boolean insertCategory(Category c) {
		boolean b = true;
		try
		{
			sess.beginTransaction();
			sess.save(c);
			sess.getTransaction().commit();
			
		}catch(Exception ex)
		{
			b = false;
			sess.getTransaction().rollback();
			ex.printStackTrace();
		}
		
		return b;
	}


}
