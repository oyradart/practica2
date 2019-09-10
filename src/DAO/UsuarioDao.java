package DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import amodelo.Usuario;


@Repository
public class UsuarioDao {
	
	 @Autowired
	    private SessionFactory sessionFactory;
	 

	   public SessionFactory getSessionFactory() {
	        return sessionFactory;
	    }

	    public void setSessionFactory(SessionFactory sessionFactory) {
	        this.sessionFactory = sessionFactory;
	    }

	    public void addUsuario(Usuario Usuario) {
	        getSessionFactory().getCurrentSession().save(Usuario);

	    }

	    public void deleteUsuario(Usuario Usuario) {
	        getSessionFactory().getCurrentSession().delete(Usuario);
	    }

	    public void updateUsuario(Usuario Usuario) {
	        getSessionFactory().getCurrentSession().update(Usuario);
	    }
	    
	    public List<Usuario> getUsuarios() {
	        List list = getSessionFactory().getCurrentSession()
	                .createQuery("from Usuario").list();
	        return list;
	    }
	    

}
