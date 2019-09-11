package knew;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
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
	

	

	public void buttonAction(ActionEvent actionEvent) throws IOException { 
		
		
		FacesMessage cuenta = new FacesMessage(this.getUsuarioService().primerUsuario(),"Se creo correctamente el paciente");
		FacesContext.getCurrentInstance().addMessage(null, cuenta);
		//------
		HttpSession session = SessionUtils.getSession();
		session.setAttribute("username", "hola");
		//------
		FacesContext contex = FacesContext.getCurrentInstance();
		contex.getExternalContext().redirect("http://localhost:8080/knew/salida.xhtml");

	}  
	
	public void validacion() throws IOException {
		HttpSession session = SessionUtils.getSession();
		String valor=(String) session.getAttribute("username");
		if(valor==null) {
			FacesContext contex = FacesContext.getCurrentInstance();
			contex.getExternalContext().redirect("http://localhost:8080/knew/index.xhtml");
		}
		
		
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
