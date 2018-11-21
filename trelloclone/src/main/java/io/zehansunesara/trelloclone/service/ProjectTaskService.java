package io.zehansunesara.trelloclone.service;

import io.zehansunesara.trelloclone.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService {

    @Autowired
    private ProjectTaskRepository projectTaskRepository;
}
