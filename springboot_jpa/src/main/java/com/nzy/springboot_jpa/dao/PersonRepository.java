package com.nzy.springboot_jpa.dao;

import com.nzy.springboot_jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
@RepositoryRestResource(path="people")
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByAddr(String name);

    Person findByNameAndAddr(String name, String addr);

    @Query("select p from Person p where p.name=?1 and p.addr=?2")
    Person withNameAndAddrQuery(String name, String addr);

    List<Person> withNameAndAddrNamedQuery(@Param("name") String name, @Param("addr") String addr);
}
