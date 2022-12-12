package com.nttdata.banco.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Customer document.
 */
@Getter
@AllArgsConstructor
@Setter
@NoArgsConstructor
@Document (collection = "customers")
public class Customer {
    @Id
    public String id;
    //Full name of the Customer
    private String name;
    //Email of the Customer
    private String email;
    //Phone of the Customer
    private String phone;
    //Document (DNI or RUC) of the Customer
    private String document;
    //Customer's type: Person or Business
    private String type;
}
