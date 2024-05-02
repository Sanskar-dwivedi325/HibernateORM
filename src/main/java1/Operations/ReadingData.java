package Operations;

import pojo.Student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ReadingData {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Read");
        EntityManager entityManager= entityManagerFactory.createEntityManager();
        Student student = entityManager.find(Student.class, 100);
        System.out.println(student.getCourses());
        System.out.println(student.getName());
        System.out.println(student.getRollno());
    }
}
