package nifax.control.hibernate;

import org.hibernate.Query;

/**
 *
 * @author faka
 */
public interface IOperation {
    void Insert(Object obj);
    Query Select(String AQuery);
}
