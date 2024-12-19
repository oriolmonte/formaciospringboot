package com.oriol.jobproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oriol.jobproject.model.JobPost;
import com.oriol.jobproject.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;
    public void addJobPost(JobPost jobPost){
        repo.addJobPost(jobPost);
    }
    public List<JobPost> getAllJobs()
    {
        return repo.returnAllJobPosts();
    }


}
