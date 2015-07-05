
package nifax.control.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author faka
 */
@Entity
@Table(name = "SESSION")
public class Session implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "session_id")
    private Long id;
    @Column(name = "status")
    private String status;
    @JoinColumn(name = "user_id") 
    @OneToOne
    private UserEmployee user_id;

    public Session() {
    }

    public Session(String status, UserEmployee user_id) throws IllegalArgumentException {
        if(user_id != null){
            this.status = status;
            this.user_id = user_id;
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public String getStatus() {
        return status;
    }

    public UserEmployee getUser_id() {
        return user_id;
    }
    
}
