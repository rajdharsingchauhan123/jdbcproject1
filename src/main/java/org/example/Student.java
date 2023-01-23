package org.example;


import javax.persistence.*;

@Entity
@Table
public class Student {
   // @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private  String city;

    public Student() {
    }

    public Student(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "org.example.Student{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", city='" + this.city + '\'' +
                '}';
    }
}
