package com.origen.hibernate.dao;

import com.origen.hibernate.beans.UsuarioBean;
import com.origen.hibernate.dao.general.DAOGeneral;
import com.origen.hibernate.model.Usuario;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class UsuarioDAOImpl2 extends DAOGeneral<Usuario, String> implements UsuarioDAO {

    private static final Logger logger = LoggerFactory.getLogger(UsuarioDAOImpl.class);

    public UsuarioDAOImpl2() {
        super(null);
        setReferenciaEntidad(Usuario.class);
    }
    public String obtenerPasswordUsuario(String id){
        System.out.println("  >>>  UsuarioDAOImpl2 <<<<<");        
        Usuario usuarioSession = (Usuario)getById(id);
        String pass = usuarioSession.getUserPassw();
        
        return "Hola";
    } 


}
