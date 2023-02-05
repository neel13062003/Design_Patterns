package onetomany;

import javax.persistence.*;

/**
 *
 * @author miraj
 */
@Entity
public class Course {

    private String cname;

    @Id
    @GeneratedValue
    private int Cid;

    
    //add for bidirection ....
    @ManyToOne(cascade = CascadeType.ALL)
    private Person p;

    public Person getP() {
        return p;
    }

    public void setP(Person p) {
        this.p = p;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public int getCid() {
        return Cid;
    }

    public void setCid(int Cid) {
        this.Cid = Cid;
    }

}
