package com.oriol.springbootrest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.oriol.springbootrest.model.JobPost;
import com.oriol.springbootrest.service.JobService;

import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {

    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    @ResponseBody
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

	@GetMapping("jobPost/{postId}")
    @ResponseBody
	public JobPost getJob(@PathVariable int postId) {
		return service.getJob(postId);
	}

    @PostMapping("addJob")
    @ResponseBody
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJobPost(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @GetMapping("jobPost/keyword/{keyword}")
    @ResponseBody
    public List<JobPost> getJobByKeyword(@PathVariable String keyword){
        return service.getJobByKeyword(keyword);
    }

    @PutMapping("jobPost/{postId}")
    @ResponseBody
    public JobPost updateJobPost(@RequestBody JobPost jobPost){
        return service.updateJobPost(jobPost);
    }
    @GetMapping("load")
    @ResponseBody
    public String loadData() {
        service.load();
        return "Success";
    }
    
    
}
