package com.xcelerateit.service;

import com.xcelerateit.common.dto.JobResponse;

import java.util.List;

public interface JobSearchService {
    List<JobResponse> searchJobs(String title, String location);

}
