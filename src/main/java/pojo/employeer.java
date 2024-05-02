package pojo;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Component
@Scope("prototype")
@Entity
public class employeer {


    private String emp_role;
    private String emp_name;
    @OneToOne(mappedBy = "emp")
    private EmployeerIdCard emidcard;

    public EmployeerIdCard getEmidcard() {
        return emidcard;
    }

    public void setEmidcard(EmployeerIdCard emidcard) {
        this.emidcard = emidcard;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int emp_id;


    public String getEmp_role() {
        return emp_role;
    }

    public void setEmp_role(String emp_role) {
        this.emp_role = emp_role;
    }

    public String getEmp_name() {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    @Override
    public String toString() {
        return "employeer{" +
                "emp_role='" + emp_role + '\'' +
                ", emp_name='" + emp_name + '\'' +
                ", emidcard=" + emidcard +
                ", emp_id=" + emp_id +
                '}';
    }
}
