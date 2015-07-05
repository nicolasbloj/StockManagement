package nifax.control.model.handler;

import java.util.logging.Level;
import java.util.logging.Logger;
import nifax.control.hibernate.IOperation;
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
            session = HibernateUtil.getSessionFactory().getCurrentSession();
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
