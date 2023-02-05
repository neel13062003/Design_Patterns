package manytomany;

import javax.persistence.*;
import java.util.*;

/**
 *
 * @author miraj
 */
@Entity
public class Person {

    private String name;

    @Id
    @GeneratedValue
    private int Pid;

    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name="Pid")
    private Set<Course> courses = new HashSet<Course>();

    public Set<Course> getCourses() {
        return courses;
    }

    public void setCourses(Set<Course> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return Pid;
    }

    public void setPid(int Pid) {
        this.Pid = Pid;
    }

}
