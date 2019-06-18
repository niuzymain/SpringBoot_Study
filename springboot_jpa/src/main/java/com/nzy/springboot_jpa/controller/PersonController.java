package com.nzy.springboot_jpa.controller;

import com.nzy.springboot_jpa.dao.PersonRepository;
import com.nzy.springboot_jpa.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/save")
    public Map<String,Object> savePerson(String name, String addr, Integer age) {
        Map<String,Object> map = new HashMap<>();
        Person p = new Person(name, addr, age);
        Person p1 = personRepository.save(p);
        map.put("person",p1);
        return map;
    }

    @RequestMapping("/query1/{ad}")
    public Map<String,Object> findByAddr(@PathVariable("ad") String addr){
        Map<String,Object> map = new HashMap<>();
        List<Person> personList= personRepository.findByAddr(addr);
        map.put("list",personList);
        return map;
    }

    @RequestMapping("/query2")
    public Map<String,Object> findByAddrAndName(@RequestParam("arg1") String name, @RequestParam("arg2") String addr){
        Map<String,Object> map = new HashMap<>();
        Person person= personRepository.findByNameAndAddr(name,addr);
        map.put("person",person);
        return map;
    }

    @RequestMapping("/query3")
    public Map<String,Object> findByAddrAndNameQuery(String name,String addr){
        Map<String,Object> map = new HashMap<>();
        Person person= personRepository.withNameAndAddrQuery(name,addr);
        map.put("person",person);
        return map;
    }

    @RequestMapping("/query4")
    public Map<String,Object> findByAddrAndNameNamedQuery(String name,String addr){
        Map<String,Object> map = new HashMap<>();
        List<Person> personList= personRepository.withNameAndAddrNamedQuery(name,addr);
        map.put("list",personList);
        return map;
    }

    @RequestMapping("/sort")
    public List<Person> sortPerson(){
        Map<String,Object> map = new HashMap<>();
        List<Person> personList = personRepository.findAll(new Sort(Sort.Direction.ASC,"age"));
        return personList;
    }

    @RequestMapping("/page")
    public Map<String,Object> pagePerson(){
        Map<String,Object> map = new HashMap<>();
        Page<Person> personPage= personRepository.findAll(new PageRequest(1,3));
        map.put("page",personPage);
        return map;
    }
}
