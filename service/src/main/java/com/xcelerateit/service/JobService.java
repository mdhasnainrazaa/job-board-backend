package com.xcelerateit.service;

import com.xcelerateit.domain.Job;

import java.util.List;
import java.util.Optional;

public interface JobService {
    Job addJob(Job job);
    List<Job> getAllJobs();
    Optional<Job> getJobById(Long id);
    void deleteJobById(Long id);
}
