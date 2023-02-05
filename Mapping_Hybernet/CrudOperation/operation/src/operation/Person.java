/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operation;

import javax.persistence.*;
import java.util.*;

//manytomany

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
