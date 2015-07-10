package nifax.control.model;

import java.io.Serializable;
import javax.persistence.*;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "EMPLOYEE")
public class Employee implements Serializable {

    protected Employee() {
    }

    public Employee(String firstname, String lastname, String cellphone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.cellphone = cellphone;
    }

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "employee_id")
    private Long id;
    @Column(name = "firstname")
    private String firstname;
    @Column(name = "lastname")
    private String lastname;
    @Column(name = "cell_phone")
    private String cellphone;

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getCellphone() {
        return cellphone;
    }

}
