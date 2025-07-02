package com.xcelerateit.common.dto;

public class JobResponse {
    private Long id;
    private String title;
    private String description;
    private String company;
    private String location;

    public JobResponse(Long id, String title, String description, String company, String location) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.company = company;
        this.location = location;
    }

    // Getters only (immutable DTO)
    public Long getId() { return id; }
    public String getTitle() { return title; }
    public String getCompany() { return company; }
    public String getLocation() { return location; }
}
