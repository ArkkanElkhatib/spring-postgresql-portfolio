package com.example.demo.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller // Manages requests
@RequestMapping(path = "/projects") // Base path
public class ProjectController {

    private ProjectService projectService;

    @Autowired
    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public String loadProjectsPage(Model model) {
        List<Project> projects = projectService.getProjects();
        model.addAttribute("projects", projects);
        return "projects.html";
    }

}
