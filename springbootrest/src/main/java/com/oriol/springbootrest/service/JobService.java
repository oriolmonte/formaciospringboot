package com.oriol.springbootrest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oriol.springbootrest.model.JobPost;
import com.oriol.springbootrest.repo.JobRepo;

@Service
public class JobService {

    @Autowired
    public JobRepo repo;
    public void addJobPost(JobPost jobPost){
        repo.save(jobPost);
    }
    public List<JobPost> getAllJobs()
    {
        return repo.findAll();
    }
    public JobPost getJob(int i) {
        return repo.findById(i).orElse(new JobPost());
    }
    public JobPost updateJobPost(JobPost jobPost) {
        return repo.save(jobPost);
    }
    public void deleteJobPost(int i) {
        repo.deleteById(i);
    }
    public void load() {
        List<JobPost> jobPosts = List.of(
            new JobPost(1, "Java Developer", "Must have good experience in core Java and advanced Java", 2,
            List.of("Core Java", "J2EE", "Spring Boot", "Hibernate")),
            new JobPost(2, "Frontend Developer", "Experience in building responsive web applications using React",
            3, List.of("HTML", "CSS", "JavaScript", "React")),
            new JobPost(3, "Data Scientist", "Strong background in machine learning and data analysis", 4,
            List.of("Python", "Machine Learning", "Data Analysis")),
            new JobPost(4, "Network Engineer",
            "Design and implement computer networks for efficient data communication", 5,
            List.of("Networking", "Cisco", "Routing", "Switching")),
            new JobPost(5, "Mobile App Developer", "Experience in mobile app development for iOS and Android",
            3, List.of("iOS Development", "Android Development", "Mobile App")),
            new JobPost(6, "DevOps Engineer", "Implement and manage continuous integration and delivery pipelines",
            4, List.of("DevOps", "CI/CD", "Docker", "Kubernetes")),
            new JobPost(7, "UI/UX Designer", "Create engaging user experiences and intuitive user interfaces",
            2, List.of("User Experience", "User Interface Design", "Prototyping")),
            new JobPost(8, "Cybersecurity Analyst", "Protect computer systems and networks from cyber threats",
            4, List.of("Cybersecurity", "Network Security", "Incident Response"))
        );
        repo.saveAll(jobPosts);
    }
    public List<JobPost> getJobByKeyword(String keyword) {
        return repo.findByPostProfileContainingOrPostDescContaining(keyword, keyword);
    }

}
