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
    public ModelOperation() {
    }
    
    public static ModelOperation getInstance(){
        if(instance == null)
            instance = new ModelOperation();
        return instance;
    }    
    
    @Override
    public void Insert(Object obj) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            logger.info("Insertando registro");
            Transaction tx = session.beginTransaction();
            session.save(obj);
            tx.commit();
            logger.info("Finalizado...");            
        } catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw e;
        }finally {
            session.close();
        }
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
    
    @Override    
    public Boolean Update(Object obj){
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            Transaction tx = session.beginTransaction();
            logger.info("Modificando registros");
            session.saveOrUpdate(obj);
            tx.commit();
            logger.info("Finalizado...");
        }
        catch (RuntimeException e) {
            session.getTransaction().rollback();
            throw e;
        }finally {
            session.close();
        }
        return true;
    }
}
