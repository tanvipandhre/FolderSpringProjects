package com.example.JobApp;

import com.example.JobApp.model.JobPost;
import com.example.JobApp.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class JobController {
    //in the the controller we have service object
    @Autowired
    private JobService service;
    @RequestMapping({"/home","/"})
    public String home() {
        System.out.println("in job controller");
        return "home"; // This matches home.jsp
    }

    @RequestMapping("/addjob")
    public String addJob(){
        System.out.println("inside add job");
        return "addjob";
    }
    @PostMapping ("/handleForm")
    public String handleForm(JobPost jobPost){
        service.addJob(jobPost);
        return "success";
    }
    @GetMapping("/viewalljobs")
    public String viewjobs(Model m){
        List<JobPost> jobs = service.getAllJobs();
        //System.out.println("Job Posts: " + jobs);

        m.addAttribute("jobPosts", jobs);
        return "viewalljobs";
    }

}
