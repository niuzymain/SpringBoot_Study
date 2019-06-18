package com.nzy.transaction.dao;

import com.nzy.transaction.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {

}
