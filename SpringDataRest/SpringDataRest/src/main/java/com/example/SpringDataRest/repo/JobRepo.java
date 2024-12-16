package com.example.SpringDataRest.repo;

import com.example.SpringDataRest.model.JobPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepo extends JpaRepository<JobPost, Integer> {
    //Jpa implementation, using Query DSL to fetch from Database
    List<JobPost> findByPostProfileContainingOrPostDescContaining(String postProfile, String postDesc);
}
