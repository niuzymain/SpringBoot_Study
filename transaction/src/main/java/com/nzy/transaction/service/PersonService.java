package com.nzy.transaction.service;

import com.nzy.transaction.entity.Person;
import org.springframework.stereotype.Service;

public interface PersonService {
    public Person saveWithRollBack(Person person);
    public Person saveNoRollBack(Person person);
}
