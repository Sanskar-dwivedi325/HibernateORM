package pojo;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
public class Courses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int courseid;
    private String coursename;



    @ManyToOne(fetch = FetchType.LAZY)
    private Student student;

    @Override
    public String toString() {
        return "Courses{" +
                "courseid=" + courseid +
                ", coursename='" + coursename + '\'' +
                '}';
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }
}
