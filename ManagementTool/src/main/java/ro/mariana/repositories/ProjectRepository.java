package ro.mariana.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ro.mariana.domain.Project;

@Repository
public interface ProjectRepository extends CrudRepository<Project, Long> {
}
