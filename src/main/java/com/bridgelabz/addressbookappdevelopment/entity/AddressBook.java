/** AddressBook.java */
package com.bridgelabz.addressbookappdevelopment.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
public class AddressBook {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phoneNumber;
    private String email;
    private LocalDate createdDate;
    private LocalDate updatedDate;

    public AddressBook() {
        this.createdDate = LocalDate.now();
        this.updatedDate = LocalDate.now();
    }
}

