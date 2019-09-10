package knew;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.servlet.http.HttpSession;

import amodelo.Usuario;
import services.UsuarioService;
import utils.SessionUtils;

@ManagedBean(name="User")
@ViewScoped
public class Logica implements Serializable {
	
	private static final long serialVersionUID = 1094801825228386363L;

	
	@ManagedProperty(value = "#{UsuarioService}")
	private UsuarioService usuarioService;
	

	public void buttonAction(ActionEvent actionEvent) { 
		
		
		FacesMessage cuenta = new FacesMessage(this.getUsuarioService().primerUsuario(),"Se creo correctamente el paciente");
		FacesContext.getCurrentInstance().addMessage(null, cuenta);

	}  

	public void moverse(String summary){
		
		
	}
	

	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	
	

}
