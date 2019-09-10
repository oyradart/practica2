package services;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import DAO.UsuarioDao;
import amodelo.Usuario;

@Service("UsuarioService")
@Transactional(readOnly = true)
public class UsuarioService  {

	// CustomerDAO is injected...
		@Autowired
		private UsuarioDao usuarioDao;

		@Transactional(readOnly = false)
		public void addUsuario(Usuario usuario) {
			UsuarioDao().addUsuario(usuario);
		}

		@Transactional(readOnly = false)
		public void deleteUsuario(Usuario usuario) {
			UsuarioDao().deleteUsuario(usuario);
		}

		@Transactional(readOnly = false)
		public void updateUsuario(Usuario usuario) {
			UsuarioDao().updateUsuario(usuario);
		}

		public UsuarioDao UsuarioDao() {
			return usuarioDao;
		}
		public List<Usuario> getUsuarios() {
			return UsuarioDao().getUsuarios();
		}

		public void setUsuarioDao(UsuarioDao usuarioDAO) {
			this.usuarioDao = usuarioDAO;
		}

		public String primerUsuario() {
			Usuario salida= UsuarioDao().getUsuarios().get(0);
			return salida.getNombre();
		}
	
		
		
}
