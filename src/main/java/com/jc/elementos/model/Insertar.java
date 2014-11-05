/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jc.elementos.model;

import java.util.ArrayList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author campitos
 */
public class Insertar {
    public static void main(String args[]){
    SessionFactory sesion=    NewHibernateUtil.getSessionFactory();
  Session ses=  sesion.openSession();
  Transaction t=ses.beginTransaction();
  
          // ses.update(new Trabajador(2 ,"rata","de","dos patas"));
           //t.commit();
          // ses.close();
          // ses.delete(new Trabajador(4));
          // t.commit();
          // ses.close();
            // ArrayList<Trabajador> tra=(ArrayList<Trabajador>)ses.createCriteria(Trabajador.class).list();
             //for(Trabajador tonto:tra){
                 //System.out.println(tonto);
             //}
                  Trabajador uno= (Trabajador)ses.createCriteria(Trabajador.class).add(Restrictions.idEq(1)).uniqueResult();
                      t.commit();
                      ses.close();
    }
}
