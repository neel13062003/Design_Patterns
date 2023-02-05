
package adapf_exp_7_2;


import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author miraj
 */
@Entity
public class Student implements Serializable {
    @Id @GeneratedValue
    private int id;
    private int semester;
    private String name;
    public void setId(int id) {
        this.id = id;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getSemester() {
        return semester;
    }

    public String getName() {
        return name;
    }
    public String toString(){
        return this.id + " " + this.name + " " + this.semester;
    }

}
