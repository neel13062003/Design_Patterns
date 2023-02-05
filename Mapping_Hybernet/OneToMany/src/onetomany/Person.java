package onetomany;

/**
 *
 * @author miraj
 */
import javax.annotation.Generated;
import javax.persistence.*;
import java.util.*;

@Entity
public class Person {

    private String name;

    @Id
    @GeneratedValue
    private int pid;

    @OneToMany(cascade = CascadeType.ALL ,mappedBy = "p")  // bidirection add to mapping
//    @JoinColumn(name = "pid") // unidirection add to join
    private Set<Course>courses=new HashSet<Course>();

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
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

}
