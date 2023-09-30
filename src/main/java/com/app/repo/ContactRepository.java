package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
