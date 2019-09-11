package knew;

import java.io.IOException;
import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import amodelo.Usuario;

import services.UsuarioService;

@ManagedBean(name="Lista")
@ViewScoped
public class Listascontrolador implements Serializable {
	private static final long serialVersionUID = 1094801825228386363L;
	
	@ManagedProperty(value = "#{UsuarioService}")
	private UsuarioService usuarioService;

	private List<Usuario> us;
	
	
	private String nombre;
	private String clave;
	
	@PostConstruct
    public void init() {
		us=getUsuarioService().getUsuarios();
    }
	
	public void addUsuario() throws IOException {
		Usuario usu=new Usuario();
		usu.setNombre(getNombre());
		usu.setClave(getClave());
		getUsuarioService().addUsuario(usu);
		FacesContext contex = FacesContext.getCurrentInstance();
		contex.getExternalContext().redirect("http://localhost:8080/knew/salida.xhtml");
		
	}
	
	public UsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}

	public List<Usuario> getUs() {
		return us;
	}

	public void setUs(List<Usuario> us) {
		this.us = us;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	
	
	
	

}
