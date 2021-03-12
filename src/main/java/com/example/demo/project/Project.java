package com.example.demo.project;

import javax.persistence.*;
import java.util.Arrays;
import java.util.List;

@Entity // Hibernate
@Table // Postgres
public class Project {

    @Id
    @SequenceGenerator(
            name = "project_sequence",
            sequenceName = "project_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "project_sequence"
    )
    private Long id;

    private String title;

    @Lob
    private String description;

    private String technologies;
    private String imageLink;
    private String gitLink;
    private Boolean darkImage;

    @Transient
    private List<String> techList;

    public Project() {
    }

    public Project(String title, String description, String technologies,
                   String imageLink, String gitLink, Boolean darkImage) {
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.imageLink = imageLink;
        this.gitLink = gitLink;
        this.darkImage = darkImage;
    }

    public Project(Long id, String title, String description, String technologies,
                   String imageLink, String gitLink, Boolean darkImage) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.technologies = technologies;
        this.imageLink = imageLink;
        this.gitLink = gitLink;
        this.darkImage = darkImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTechnologies() {
        return technologies;
    }

    public void setTechnologies(String technologies) {
        this.technologies = technologies;
    }

    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(String imageLink) {
        this.imageLink = imageLink;
    }

    public String getGitLink() {
        return gitLink;
    }

    public void setGitLink(String gitLink) {
        this.gitLink = gitLink;
    }

    public Boolean getDarkImage() {
        return darkImage;
    }

    public void setDarkImage(Boolean darkImage) {
        this.darkImage = darkImage;
    }

    public List<String> getTechList() {
        return Arrays.asList(this.technologies.split(",[ ]"));
    }

    public void setTechList(List<String> techList) {
        this.techList = techList;
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", technologies='" + technologies + '\'' +
                ", imageLink='" + imageLink + '\'' +
                ", gitLink='" + gitLink + '\'' +
                ", darkImage=" + darkImage +
                '}';
    }
}
