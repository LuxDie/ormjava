/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ormjava;

import java.io.Serializable;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author ezequ
 */
public class Orm {
    
    public List getPersonaList() {
        return executeHQLQuery(query);
    }
    
    public Persona getPersonaById(int id) {
        List resultList = executeHQLQuery(query.concat(" WHERE P.idpersona = ").concat(String.valueOf(id)));
        Persona persona = null;
        if (!resultList.isEmpty()) {
            persona = (Persona) resultList.get(0);
        }
        return persona;
    }
    
    public int savePersona(Persona persona) {
        return save(persona);
    }
    
    private String query = "from Persona P";
    
    private List executeHQLQuery(String hql) {
        List resultList = null;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            Query q = session.createQuery(hql);
            resultList = q.list();
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return resultList;
    }
    
    private int save(Serializable serializable) {
        int newId = 0;
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            newId = (int) session.save(serializable);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
        }
        return newId;
    }
}
