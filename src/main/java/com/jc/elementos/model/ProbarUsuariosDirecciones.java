
package com.jc.elementos.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


public class ProbarUsuariosDirecciones {
    
    public static void main(String[]args){
        SessionFactory factory = NewHibernateUtil.getSessionFactory();
        Session sesion = factory.openSession();
        Transaction tranza = sesion.beginTransaction();
        
        
        Usuario u = new Usuario();
        Direccion d = new Direccion();
        
        d.setCalle("calle de la amargura");
        d.setColonia("Colonia de avon");
        d.setCp(55714);
        d.setEstado("Ebriedad");
        d.setIdUsuario(u);
        
        u.setDireccion(d);
        u.setEdad(43);
        u.setNombre("Abdia Sandra");
        u.setSueldo(40000f);
        
        sesion.save(u);
        sesion.save(d);
        
        tranza.commit();
        sesion.close();
        System.out.println("Everything is already saved");
        
        
        
        
        
        
        
    }
}
