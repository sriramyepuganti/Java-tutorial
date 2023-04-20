package com.example.be;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
interface UserRepo extends CrudRepository <User, Integer> {
    List<User> findByName(String name);
    // @Query("") // create a custom query
    // List<User> findByNameSorted(String name);

}
