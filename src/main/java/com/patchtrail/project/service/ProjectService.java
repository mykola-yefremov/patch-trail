package com.patchtrail.project.service;

import com.patchtrail.project.domain.Project;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class ProjectService {

    private final Map<UUID, Project> projects = new ConcurrentHashMap<>();

    public Project createProject(String name) {
        Project project = new Project(UUID.randomUUID(), name.trim());
        projects.put(project.id(), project);
        return project;
    }

    public List<Project>  findAll() {
        return List.copyOf(projects.values());
    }
}
