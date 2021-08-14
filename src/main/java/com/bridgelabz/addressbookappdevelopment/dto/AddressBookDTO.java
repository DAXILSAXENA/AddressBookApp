package com.bridgelabz.addressbookappdevelopment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AddressBookDTO {

    private String name;
    private String address;
    private String email;
    private String phoneNumber;
    private String state;
}
