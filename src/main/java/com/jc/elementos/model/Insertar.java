/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author campitos
 */
public class Insertar {
    public static void main(String args[]){
    SessionFactory sesion=    NewHibernateUtil.getSessionFactory();
  Session mala=  sesion.openSession();
  Transaction t=mala.beginTransaction();
  
                 mala.save(new Trabajador("juan", "campos", "martinez"));
             t.commit();
                 sesion.close();
                 System.out.println("Se ha guardado este trabajadorcito");
    }
}
