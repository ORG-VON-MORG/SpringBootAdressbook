package de.htwsaar.SpringBootAdressbook.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@Getter
@Setter
@ToString
@Entity
public class Person {

    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String street;
    private String city;
    private String postalCode;
    private Date birthday;

}
