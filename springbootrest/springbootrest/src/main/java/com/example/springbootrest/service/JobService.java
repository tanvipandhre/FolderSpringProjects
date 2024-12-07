package com.example.springbootrest.service;

import com.example.springbootrest.model.JobPost;
import com.example.springbootrest.repo.JobRepo;
import com.example.springbootrest.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class JobService {
    //in service we have repo object
    @Autowired
    private JobRepo repo;

    public void addJob(JobPost jobPost){

        //repo.addJobPost(jobPost);
        repo.save(jobPost);
    }
    public List<JobPost> getAllJobs(){

        //return repo.getAllJobs();
        return repo.findAll();
    }

    public JobPost getJob(int postId) {

        //return repo.getJob(postId);
        return repo.findById(postId).orElse(new JobPost());
    }

    public void updateJob(JobPost jobPost) {
        //repo.updateJob(jobPost);
        repo.save(jobPost);
    }

    public void deleteJob(int postId) {
        //repo.deleteJob(postId);
        repo.deleteById(postId);
    }

    public void load() {
        List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Dev", "Develop API", 5, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                    3, List.of("HTML", "CSS", "JavaScript", "React"))
    ));
        repo.saveAll(jobs);
    }

    public List<JobPost> search(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }


}
