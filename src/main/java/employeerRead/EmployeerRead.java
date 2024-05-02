package employeerRead;

import pojo.EmployeerIdCard;
import pojo.employeer;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class EmployeerRead {
    public static void main(String[] args) {
          employeer[] employeers=new employeer[10];
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("Read");
        EntityManager em=emf.createEntityManager();


        /* //getting all data from database in once
        Query query = em.createQuery("select count(emp_id) from employeer");
        long i=(long)query.getSingleResult();
        for (int j = 1; j <=i ; j++) {
        employeers[j]=em.find(employeer.class,j);
            System.out.println(employeers[j]);
        }*/


        employeer emp =(employeer) em.find(employeer.class, 1);
        System.out.println(emp);

    }
}
