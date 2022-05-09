package com.example.file.springfiles.repository;

import com.example.file.springfiles.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SpringReadFileRepository extends CrudRepository<User, Long> {
}
