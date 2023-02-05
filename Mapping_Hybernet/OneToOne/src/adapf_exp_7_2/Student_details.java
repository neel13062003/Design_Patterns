/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapf_exp_7_2;

import java.io.Serializable;
import javax.persistence.*;

/**
 *
 * @author miraj
 */
@Entity
public class Student_details {

    @Id @GeneratedValue
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id")
    private Student stu;
    private String Address;

    public Student getStu() {
        return stu;
    }

    public void setStu(Student stu) {
        this.stu = stu;
    }

    public int getId() {
        return id;
    }

    public String getAddress() {
        return Address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

}
