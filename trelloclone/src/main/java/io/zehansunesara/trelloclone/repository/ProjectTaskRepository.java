package io.zehansunesara.trelloclone.repository;

import io.zehansunesara.trelloclone.domain.ProjectTask;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends CrudRepository<ProjectTask, Long> {
}
