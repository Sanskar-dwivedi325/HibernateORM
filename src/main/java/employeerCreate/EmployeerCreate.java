package employeerCreate;


import pojo.EmployeerIdCard;
import pojo.employeer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class EmployeerCreate {
    public static void main(String[] args) {
    ApplicationContext Ac=new AnnotationConfigApplicationContext("org.example");
    employeer e= new employeer();
   employeer e2=new employeer();
    e.setEmp_name("Ritik");
    e.setEmp_role("s3");
        e2.setEmp_name("Ritika");
        e2.setEmp_role("s3a");

        EmployeerIdCard c1=new EmployeerIdCard();
        c1.setSoftware_version(15);
        c1.setEmp(e);


        EmployeerIdCard c2=new EmployeerIdCard();
        c2.setSoftware_version(18);
        c2.setEmp(e2);


    EntityManagerFactory emf= Persistence.createEntityManagerFactory("Create");
    EntityManager em=emf.createEntityManager();
        EntityTransaction et= em.getTransaction();

        et.begin();
        em.persist(e);
        em.persist(e2);
        em.persist(c1);
        em.persist(c2);
        et.commit();


    }
}