package com.kdtechno.studentsservices.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kdtechno.studentsservices.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

}
