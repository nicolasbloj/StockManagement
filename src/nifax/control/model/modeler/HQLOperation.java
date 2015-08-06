package nifax.control.model.modeler;

import java.math.BigInteger;
import nifax.control.model.modeler.operation.IHQLOperation;
import java.util.List;
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
public class HQLOperation implements IHQLOperation{
    private static final Logger logger = Logger.getLogger(HQLOperation.class.getName());
    private Session session = null;   
    private static HQLOperation instance = null;
    protected HQLOperation() {
    }

    public static HQLOperation getInstance(){
        if(instance == null)
            instance = new HQLOperation();
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

    public Query HQLSelect(String AQuery) {
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
    public List Select(String AQuery){
        return HQLSelect(AQuery)
                .list();
    }

    @Override
    public List Select(String AQuery, Object obj){
        return HQLSelect(AQuery)
                .setProperties(obj)
                .list();
    }

    @Override
    public Object SelectCount(String AQuery, Object obj, int nrow){
        return null; //Not implemented yet
    }

    @Override
    public Object SelectUnique(String AQuery, Object obj){
        return HQLSelect(AQuery)
                .setProperties(obj)
                .setMaxResults(1)
                .uniqueResult();
    }
    
    
    @Override
    public List SelectLike(String ATable, String AField, String ACondition){
        StringBuilder sql = new StringBuilder();
        sql.append(String.format("select description from %s where %s like :searchKey group by description ", ATable, AField));
        return HQLSelect(sql.toString())
            .setParameter("searchKey", "%" + ACondition + "%")
            .list();
    }

    
    @Override
        public Object SelectUnique(String AQuery){
        return HQLSelect(AQuery)
            .setMaxResults(1)
            .uniqueResult();
    }
    
    @Override
    public List Select(String AQuery, String parameter , Object value) {
        return HQLSelect(AQuery).setParameter(parameter,value).list();
    }
    
    public Long getNextSequenceValue(final String SequenceName) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = 
        session.createSQLQuery(String.format("select nextval('public.%s')", SequenceName));
        return ((BigInteger) query.uniqueResult()).longValue();
}
    public Long getCurrSequenceValue(final String SequenceName) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = 
        session.createSQLQuery(String.format("select currval('public.%s')", SequenceName));
        return ((BigInteger) query.uniqueResult()).longValue();
}
    
}
