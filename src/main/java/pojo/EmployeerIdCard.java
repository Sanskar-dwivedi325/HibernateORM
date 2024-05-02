package pojo;

import javax.persistence.*;

@Entity
public class EmployeerIdCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id_no;
    private int software_version;

    public employeer getEmp() {
        return emp;
    }

    public void setEmp(employeer emp) {
        this.emp = emp;
    }

    @OneToOne(fetch = FetchType.LAZY)
    private employeer emp;

    public int getId_no() {
        return id_no;
    }

    public void setId_no(int id_no) {
        this.id_no = id_no;
    }

    public int getSoftware_version() {
        return software_version;
    }

    @Override
    public String toString() {
        return "EmployeerIdCard{" +
                "id_no=" + id_no +
                ", software_version=" + software_version +

                '}';
    }

    public void setSoftware_version(int software_version) {
        this.software_version = software_version;
    }
}
