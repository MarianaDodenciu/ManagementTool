package ro.mariana.services;

import org.springframework.stereotype.Service;
import ro.mariana.domain.Project;
import ro.mariana.exceptions.ProjectIdException;
import ro.mariana.repositories.ProjectRepository;

import java.util.Locale;

@Service
public class ProjectService {

    private ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public Project saveOrUpdate(Project project) {
        try {
            project.setProjectIdentifier(project.getProjectIdentifier().toUpperCase(Locale.ROOT));
            return projectRepository.save(project);
        } catch (Exception e) {
            throw new ProjectIdException("Project id " + project.getProjectIdentifier().toUpperCase(Locale.ROOT)); //var 1
            //vezi care e diferenta,cum arata eroarea cu var 1 si var 2
            //throw new ProjectIdException("Project id " + project.getProjectIdentifier().toUpperCase(Locale.ROOT), e); //var 2
        }
    }

    public Project findByProjectIdentifier(String projectId) {

        Project project = projectRepository.findByProjectIdentifier(projectId);
        if(project == null) {
            throw new ProjectIdException("Project does not exist in the database");
        }
        return project;
    }

    public Iterable<Project> findAllProjects() {
        return projectRepository.findAll();
    }
}
