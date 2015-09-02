package nifax.control.model.modeler.operation;

import java.util.List;
import org.hibernate.criterion.MatchMode;

/**
 *
 * @author faka
 */
public interface IHQLOperation {
    Boolean Insert(Object obj);
    List Select(String AQuery);
    Object Select(String AQuery, Object obj);
    List Select(String AQuery, String parameter,Object value);
    Integer SelectCount(Class obj);
    int SelectCount(String AQuery);
    int SelectCount(String AQuery, String fieldName, Object valueName);
    Object SelectUnique(String AQuery, Object obj) throws Exception;
    Boolean Update(Object obj);
    Boolean Delete(Object obj);
    List SelectLike(String ATable,String AField,String ACondition);
    List SelectLike(Class AClass,String parameter,String [] values,MatchMode matchMode);
    Object SelectUnique(String AQuery);
    List SelectCacheable(String AQuery, String parameter,Object value);
}
