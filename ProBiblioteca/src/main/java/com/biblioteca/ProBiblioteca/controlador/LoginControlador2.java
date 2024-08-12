package com.biblioteca.ProBiblioteca.controlador;

import com.biblioteca.ProBiblioteca.modelo.Usuario;
import com.biblioteca.ProBiblioteca.servicio.UsuarioServicio;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.annotation.SessionScope;

@Controller
@RequestMapping("/login")
@SessionScope
public class LoginControlador2 {

    @Autowired
    private UsuarioServicio usuarioServicio;

    private String username;
    private String password;
    private String error;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    @GetMapping
    public String abrirLogin(){
        return "/login.xhtml";
    }

    @PostMapping("/procesar")
    public String procesarLogin() {
        Usuario usuario = usuarioServicio.obtenerUsuarioPorUsername(username);
        if (usuario != null && usuario.getPassword().equals(password)) {
            FacesContext facesContext = FacesContext.getCurrentInstance();
            HttpSession session = (HttpSession) facesContext.getExternalContext().getSession(true);
            session.setAttribute("user", usuario);
            //return "redirect:/crud";
            return "redirect:/crud.xhtml";
        } else {
            error = "Usuario o contraseña incorrectos";
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, error, null));
            return "/login";
        }
    }

}
