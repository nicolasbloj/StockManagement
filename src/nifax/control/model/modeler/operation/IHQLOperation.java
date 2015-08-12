package nifax.control.model.modeler.operation;

import java.util.List;

/**
 *
 * @author faka
 */
public interface IHQLOperation {
    Boolean Insert(Object obj);
    List Select(String AQuery);
    Object Select(String AQuery, Object obj);
    List Select(String AQuery, String parameter,Object value);
    Object SelectCount(String AQuery, Object obj, int nrow);
    Object SelectUnique(String AQuery, Object obj) throws Exception;
    Boolean Update(Object obj);
    Boolean Delete(Object obj);
    List SelectLike(String ATable,String AField,String ACondition);
    Object SelectUnique(String AQuery);
    List SelectCacheable(String AQuery, String parameter,Object value);
}
