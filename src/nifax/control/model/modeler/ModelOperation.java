package nifax.control.model.modeler;

import java.util.logging.Level;
import java.util.logging.Logger;
import nifax.control.hibernate.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author faka
 */

public class ModelOperation implements IOperation{
    private static final Logger logger = Logger.getLogger(ModelOperation.class.getName());
    private Session session = null;   
    private static ModelOperation instance = null;
    protected ModelOperation() {
    }
    
    public static ModelOperation getInstance(){
        if(instance == null)
            instance = new ModelOperation();
        return instance;
    }    
    
    private Boolean executeHibernateHQLStament(Object obj, Integer n, String op){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            logger.info(op);
            Transaction tx = session.beginTransaction();
            switch(n){
                case 1:
                    session.save(obj);
                    break;
                case 2:
                    session.saveOrUpdate(obj);
                    break;
                case 3:
                    session.delete(obj);
                    break;
            }            
            tx.commit();
            logger.info("Operación Finalizada...");            
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw e;
        }finally {
            session.close();
        }
        return Boolean.TRUE;
    }
    
    @Override
    public Boolean Insert(Object obj) {        
        return executeHibernateHQLStament(obj, 1, "Insertando Registros");
    }
    
    @Override    
    public Boolean Update(Object obj){        
        return executeHibernateHQLStament(obj, 2, "Modificando registros");
    }

    @Override    
    public Boolean Delete(Object obj){        
        return executeHibernateHQLStament(obj, 3, "Borrando registros");
    }

    @Override
    public Query Select(String AQuery) {
        Query slist = null;
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            logger.info("Listando registros");
            slist = session.createQuery(AQuery);
            logger.info("Finalizado...");
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage(), e);
        } 
        return slist;
    }            
}
