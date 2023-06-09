package com.example.tanfeeth.Serveice;

import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Model.Project;
import com.example.tanfeeth.Repository.MyUserRepository;
import com.example.tanfeeth.Repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

@Service
    @AllArgsConstructor
    public class ProjectService {

        private final ProjectRepository projectRepository;



        public List<Project> getAll(){
            return projectRepository.findAll();
        }

        public void add(Project project, Errors errors){

        }

        public void update(Integer id,Project project,Errors errors){

        }


        public void delete(Integer id) {
        }



        public Optional<Project> findById(Integer id){
            return projectRepository.findById(id);
        }
    }




