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
import org.hibernate.Transaction;

/**
 *
 * @author medin
 */
public class ProductoDAO {

    Session session;

    public ProductoDAO() {
        session = HibernateUtil.getLocalSession();
    }

    public ProductoDAO(Session session) {
        this.session = session;
    }

    public List<Producto> getAll() {
        return (List<Producto>) session.createCriteria(Producto.class)
                .list();
    }

    public boolean savePersona(int idFormulario, String apellidoU, String nombreU, 
              String numeroS, String descrip, String fecha, String correo) {
        Producto producto = new Producto();
        //TipoPersona tipoDeTanque = (TipoPersona) session.load(TipoPersona.class, idTipoPersona);
        producto.setApellidoUsuario(apellidoU);
        producto.setCorreo(correo);
        producto.setNombreUsuario(nombreU);
        producto.setDescripcion(descrip);
        producto.setNumeroSerie(numeroS);
        producto.setFecha(fecha);
        producto.setIdFormulario(idFormulario);
        try {
            Transaction transaccion = session.beginTransaction();
            session.save(producto);
            transaccion.commit();
            return true;
        } catch (Exception e) {

        } finally {

        }
        return true;
    }
}
