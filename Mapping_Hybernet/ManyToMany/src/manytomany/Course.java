/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manytomany;

import javax.persistence.*;

/**
 *
 * @author miraj
 */
@Entity
public class Course {

    private String name;

    @Id
    @GeneratedValue
    private int id;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
