package de.htwsaar.SpringBootAdressbook.controller;

import de.htwsaar.SpringBootAdressbook.dao.PersonRepository;
import de.htwsaar.SpringBootAdressbook.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {

    @Autowired
    private PersonRepository personRepository;


    @GetMapping("/")
    public String  showPage(Model model){

        personRepository.save(new Person("Tobias","Gottschalk"));
        personRepository.save(new Person("Jasmin","Gottschalk"));
        personRepository.save(new Person("Emilian","Gottschalk"));
        personRepository.save(new Person("Max","Mustermann"));

        model.addAttribute("listePersonen",personRepository.findAll());
        return "index";
    }



}
