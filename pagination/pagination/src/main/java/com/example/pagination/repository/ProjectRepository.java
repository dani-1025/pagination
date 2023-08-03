package com.example.pagination.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.pagination.model.Project;

public interface ProjectRepository extends JpaRepository<Project , Long> {
    
}
