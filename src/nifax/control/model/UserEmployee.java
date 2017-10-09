package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;
import org.hibernate.annotations.Parameter;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDefs;
import org.jasypt.hibernate4.type.EncryptedStringType;

@TypeDefs (
    {
        @org.hibernate.annotations.TypeDef(
            name = "EncryptedString",
            typeClass = EncryptedStringType.class,
            parameters = {
                @Parameter(name = "algorithm", value = "PBEWithMD5AndDES"),
                @Parameter(name = "password", value = "123456"),
                @Parameter(name = "keyObtentionIterations", value = "1000")
            }
        )
    }
)

@Entity
@Table(name = "USEREMPLOYEE")
public class UserEmployee implements Serializable {

    protected UserEmployee() {
    }

    public UserEmployee(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public UserEmployee(String username, String password, Employee employee_id) {
        this.username = username;
        this.password = password;
        this.employee_id = employee_id;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "user_id", unique = true, nullable = false)
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    @Type(type = "EncryptedString")
    private String password;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "employee_id")
    private Employee employee_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(Employee employee_id) {
        this.employee_id = employee_id;
    }

}
