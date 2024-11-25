package com.example.JobApp.repo;

import com.example.JobApp.model.JobPost;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
public class JobRepo {
    List<JobPost> jobs = new ArrayList<>(Arrays.asList(
            new JobPost(1, "Java Dev", "Develop API", 5, List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
                    3, List.of("HTML", "CSS", "JavaScript", "React"))
    ));


    public List<JobPost> getAllJobs(){
        return jobs;

    }


    // method to save a job post object into arrayList
    public void addJobPost(JobPost job) {
        jobs.add(job);
        System.out.println(jobs);
    }
}
