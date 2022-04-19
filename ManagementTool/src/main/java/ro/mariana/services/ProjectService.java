package ro.mariana.services;

import org.springframework.stereotype.Service;
import ro.mariana.domain.Project;
import ro.mariana.repositories.ProjectRepository;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project saveOrUpdate(Project project) {
        return projectRepository.save(project);
    }
}
