/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import bean.Producto;
import hbm.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author medin
 */
public class ProductoDAO {
    
    Session session;

    public ProductoDAO() {
        session = HibernateUtil.getLocalSession();
    }
    
    public ProductoDAO(Session session){
        this.session = session;
    }
    
    public List<Producto> getAll(){
        return (List<Producto>) session.createCriteria(Producto.class)
                .list();
    }
}
