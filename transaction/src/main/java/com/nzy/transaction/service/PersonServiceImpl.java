package com.nzy.transaction.service;

import com.nzy.transaction.dao.PersonRepository;
import com.nzy.transaction.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    @Transactional(rollbackFor = IllegalArgumentException.class)
    public Person saveWithRollBack(Person person) {
        Person p = personRepository.save(person);
        if(p.getName().equals("nzy")) {
            throw new IllegalArgumentException("重复，回滚");
        }
        return p;
    }

    @Override
    @Transactional(noRollbackFor = IllegalArgumentException.class)
    public Person saveNoRollBack(Person person) {
        Person p = personRepository.save(person);
        if(p.getName().equals("nzy")) {
            throw new IllegalArgumentException("重复，但不回滚");
        }
        return p;
    }
}
