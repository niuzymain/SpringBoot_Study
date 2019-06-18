package com.nzy.cache.service;

import com.nzy.cache.dao.PersonRepository;
import com.nzy.cache.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonCacheServiceImpl implements PersonCacheService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    @CachePut(value = "people", key = "#person.id")
    public Person savePerson(Person person) {
        Person p = personRepository.save(person);
        System.out.println("id为" + p.getId() + "做缓存");
        return p;
    }

    @Override
    @CacheEvict(value = "people")
    public void removePerson(Long id) {
        System.out.println("删除id为" + id + "的缓存");
        personRepository.deleteById(id);
    }

    @Override
    @Cacheable(value = "people", key = "#person.id")
    public Person findOne(Person person) {
        Person p = personRepository.findById(person.getId()).orElse(null);
        System.out.println("为id为" + person.getId() + "做了缓存");
        return p;
    }
}
