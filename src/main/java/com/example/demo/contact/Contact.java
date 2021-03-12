package com.example.demo.contact;

import javax.persistence.*;

@Entity
@Table
public class Contact {

    @Id
    @SequenceGenerator(
            name = "contact_sequence",
            sequenceName = "contact_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "contact_sequence"
    )
    Long id;

    String email;
    String name;
    String businessName;
    String phoneNumber;
    String description;

    public Contact() {
    }

    public Contact(String email, String name, String businessName, String phoneNumber, String description) {
        this.email = email;
        this.name = name;
        this.businessName = businessName;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public Contact(Long id, String email, String name, String businessName, String phoneNumber, String description) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.businessName = businessName;
        this.phoneNumber = phoneNumber;
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", businessName='" + businessName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
