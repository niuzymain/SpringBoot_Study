package com.nzy.cache.service;

import com.nzy.cache.entity.Person;

public interface PersonCacheService {
    Person savePerson(Person person);
    void removePerson(Long id);
    Person findOne(Person person);
}
