package com.nzy.cache.controller;

import com.nzy.cache.entity.Person;
import com.nzy.cache.service.PersonCacheService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    @Autowired
    private PersonCacheService personCacheService;

    @RequestMapping("/put")
    public Person put(Person person){
        return personCacheService.savePerson(person);
    }

    @RequestMapping("/able")
    public Person able(Person person){
        return personCacheService.findOne(person);
    }

    @RequestMapping("/evit")
    public String evit(Long id){
        personCacheService.removePerson(id);
        return "success";
    }
}
