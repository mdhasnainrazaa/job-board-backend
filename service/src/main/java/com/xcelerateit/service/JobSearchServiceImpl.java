package com.xcelerateit.service;

import com.xcelerateit.common.dto.JobResponse;
import com.xcelerateit.domain.Job;
import com.xcelerateit.repository.JobRepository;
import com.xcelerateit.service.JobSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobSearchServiceImpl implements JobSearchService {

    private final JobRepository jobRepository;

    @Autowired
    public JobSearchServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<JobResponse> searchJobs(String title, String location) {
        List<Job> jobs = jobRepository.searchJobs(title, location);

        return jobs.stream()
                .map(job -> new JobResponse(
                        job.getId(),
                        job.getTitle(),
                        job.getDescription(),
                        job.getCompany(),
                        job.getLocation()
                ))
                .collect(Collectors.toList());
    }
}
