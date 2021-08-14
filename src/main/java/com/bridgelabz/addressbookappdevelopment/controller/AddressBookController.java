package com.bridgelabz.addressbookappdevelopment.controller;

import com.bridgelabz.addressbookappdevelopment.dto.AddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressBook")
public class AddressBookController {

	@GetMapping(value = { "", "/", "/get" })
	public ResponseEntity<String> getAddressBookData() {
		return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
	}

	@GetMapping("/get/{addressBookId}")
	public ResponseEntity<String> getAddressBookData(@PathVariable int addressBookId) {
		return new ResponseEntity<String>("Get Call Success for id: " + addressBookId, HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
		return new ResponseEntity<String>("Created Employee Payroll Data for:" + addressBookDTO, HttpStatus.OK);
	}


	@PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO) {
	    return new ResponseEntity<String>("Updated Employee Payroll Data for:" + addressBookDTO, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{addressBookId}")
    public ResponseEntity<String> deleteEmployeePayrollData(@PathVariable int addressBookId) {
	    return new ResponseEntity<String>("Delete Call Success for id: " + addressBookId, HttpStatus.OK);
        }

    }
