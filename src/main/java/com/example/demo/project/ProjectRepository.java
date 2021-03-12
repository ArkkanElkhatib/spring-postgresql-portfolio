package com.example.demo.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // Used to extract data from the postgres database
public interface ProjectRepository extends JpaRepository<Project, Long> {

}
