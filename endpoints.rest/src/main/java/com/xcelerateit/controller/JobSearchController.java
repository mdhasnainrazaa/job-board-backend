package com.xcelerateit.controller;

import com.xcelerateit.common.dto.JobResponse;
import com.xcelerateit.service.JobSearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/jobs") // Base path
public class JobSearchController {

    private final JobSearchService jobSearchService;

    @Autowired
    public JobSearchController(JobSearchService jobSearchService) {
        this.jobSearchService = jobSearchService;
    }

    // ✅ Only add /search here — full path becomes: /api/jobs/search
    @GetMapping("/search")
    public ResponseEntity<List<JobResponse>> searchJobs(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String location) {
        List<JobResponse> results = jobSearchService.searchJobs(title, location);
        return ResponseEntity.ok(results);
    }

}
