package spring.learnSpringSecurity.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import spring.learnSpringSecurity.models.Job;
import spring.learnSpringSecurity.repositories.JobRepository;
import spring.learnSpringSecurity.repositories.SearchRepository;

import java.util.List;


@RestController
public class JobController {

    @Autowired
    JobRepository repo;

    @Autowired
    SearchRepository srepo;

    @GetMapping("/home")
    public String homepage() {
        return "Welcome home";
    }

    @GetMapping("/Jobs")
    public List<Job> getAllJobs(){
        return repo.findAll();
    }

    @PostMapping("/Job")
    public void postJob(@RequestBody Job job){
        repo.save(job);
    }

    @GetMapping("/Job/{key}")
    public List<Job> searchJobs(@PathVariable String key){
        return srepo.findByText(key);
    }
}
