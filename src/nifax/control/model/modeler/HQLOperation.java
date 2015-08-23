package nifax.control.model.modeler;

import java.math.BigInteger;
import nifax.control.model.modeler.operation.IHQLOperation;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import nifax.control.hibernate.HibernateUtil;
import nifax.control.model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;

/**
 *
 * @author faka
 */
public class HQLOperation implements IHQLOperation {

    private static final Logger logger = Logger.getLogger(HQLOperation.class.getName());
    private Session session = null;
    private static HQLOperation instance = null;
    
    protected HQLOperation() {
    }

    public static HQLOperation getInstance() {
        if (instance == null) {
            instance = new HQLOperation();
        }
        return instance;
    }

    private Boolean executeHibernateHQLStament(Object obj, Integer n, String op) {
        try {
            session = HibernateUtil.getSessionFactory().openSession();
            logger.info(op);
            Transaction tx = session.beginTransaction();
            switch (n) {
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
        } finally {
            session.close();
        }
        return Boolean.TRUE;
    }

    @Override
    public Boolean Insert(Object obj) {
        return executeHibernateHQLStament(obj, 1, "Insertando Registros");
    }

    @Override
    public Boolean Update(Object obj) {
        return executeHibernateHQLStament(obj, 2, "Modificando registros");
    }

    @Override
    public Boolean Delete(Object obj) {
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
    public List Select(String AQuery) {
        return HQLSelect(AQuery)
            .list();
    }

    @Override
    public List Select(String AQuery, Object obj) {
        return HQLSelect(AQuery)
            .setProperties(obj)
            .list();
    }

    @Override
    public List Select(String AQuery, String parameter, Object value) {
        return HQLSelect(AQuery).setParameter(parameter, value).list();
    }

    @Override
    public List SelectCacheable(String AQuery, String parameter, Object value) {
        return HQLSelect(AQuery).setCacheable(true).setParameter(parameter, value).list();
    }

    
    @Override
    public Integer SelectCount(Class obj) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();   
        return ((Number) session.createCriteria(obj).setProjection(Projections.rowCount()).uniqueResult()).intValue();
    }

    @Override
    public Object SelectUnique(String AQuery, Object obj) {
        return HQLSelect(AQuery)
            .setProperties(obj)
            .setMaxResults(1)
            .uniqueResult();
    }

    @Override
    public List SelectLike(String ATable, String AField, String ACondition) {
        StringBuilder sql = new StringBuilder();
        sql.append(String.format("select %s from %s where %s like :searchKey group by description ", AField, ATable, AField));
        return HQLSelect(sql.toString())
            .setParameter("searchKey", ACondition + "%")
            .list();
    }

    @Override
    public Object SelectUnique(String AQuery) {
        return HQLSelect(AQuery)
                .setMaxResults(1)
                .uniqueResult();
    }

    public Integer getNextSequenceValue(final String SequenceName) {
        int result = getSequenceValue(SequenceName);
        if (result != 1)
            return result + 1;
        else
            if (SelectCount(Product.class) == 1)
                return result + 1;
        return result;
    }

    public Integer getCurrSequenceValue(final String SequenceName) {
        return getSequenceValue(SequenceName);
    }

    private Integer getSequenceValue(final String SequenceName) {
        session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();   
        Query query = session.createSQLQuery(String.format("select last_value from %s", SequenceName));
        return ((BigInteger) query.uniqueResult()).intValue();
    }

}
