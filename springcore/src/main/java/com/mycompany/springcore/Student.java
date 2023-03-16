package com.mycompany.springcore;

public class Student {

    private int Id;
    private String Name;
    private String Address;

    public Student(int Id, String Name, String Address) {
        this.Id = Id;
        this.Name = Name;
        this.Address = Address;
    }

    public Student() {
        super();
    }

    @Override
    public String toString() {
        return "Student{" + "Id=" + Id + ", Name=" + Name + ", Address=" + Address + '}';
    }
    

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

}
