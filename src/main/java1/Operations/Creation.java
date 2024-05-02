package Operations;

import pojo.Courses;
import pojo.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

public class Creation {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.setRollno(100);
        s1.setName("Raju");

        Student s2=new Student();
        s2.setName("rajesh");
        s2.setRollno(101);

        Courses c1=new Courses();
        c1.setCoursename("Java");
        c1.setStudent(s1);

        Courses c2=new Courses();
        c2.setCoursename("C++");
        c2.setStudent(s1);

        Courses c3=new Courses();
        c3.setCoursename("C");
        c3.setStudent(s1);

        List<Courses> coursesList1=new ArrayList<>();
        coursesList1.add(c1);
        coursesList1.add(c2);
        coursesList1.add(c3);

        s1.setCourses(coursesList1);


        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Create");
        EntityManager entityManager=entityManagerFactory.createEntityManager();
        EntityTransaction entityTransaction=entityManager.getTransaction();

        entityTransaction.begin();
        entityManager.persist(s1);
        entityManager.persist(s2);
        entityManager.persist(c1);
        entityManager.persist(c2);
        entityManager.persist(c3);
        entityTransaction.commit();

    }
}
