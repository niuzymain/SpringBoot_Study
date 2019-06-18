package com.nzy.transaction.controller;

import com.nzy.transaction.entity.Person;
import com.nzy.transaction.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @RequestMapping("/rollback")
    public Person Rollback(Person person) {
        return personService.saveWithRollBack(person);
    }

    @RequestMapping("/norollback")
    public Person noRollback(Person person) {
        return personService.saveNoRollBack(person);
    }

}
