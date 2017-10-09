
package nifax.control.model;

import java.io.Serializable;
import java.sql.Timestamp;
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
@Table(name = "USERSESSION")
public class UserSession implements Serializable {
    
    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "session_id")
    private Long id;
    @Column(name = "open")
    private Boolean open;
    @Column(name = "login_date")
    private Timestamp login_date;    

    @JoinColumn(name = "user_id") 
    @OneToOne
    private UserEmployee userEmployee;

    public UserSession() {
    }

    public UserSession(Boolean status, UserEmployee user_id) throws IllegalArgumentException {
        if(user_id != null){
            this.open = status;
            this.userEmployee = user_id;
            setLogin_date();
        } else {
            throw new IllegalArgumentException();
        }
    }
    
    public Boolean isOpen() {
        return open;
    }

    public void setOpen(Boolean open) {
        this.open = open;
    }

    public UserEmployee getUserEmployee() {
        return userEmployee;
    }

    public void setUserEmployee(UserEmployee userEmployee) {
        this.userEmployee = userEmployee;
    }
        
    public Timestamp getLogin_date() {
        return login_date;
    }

    private void setLogin_date() {
        this.login_date = new Timestamp(System.currentTimeMillis());
    }
    
}
