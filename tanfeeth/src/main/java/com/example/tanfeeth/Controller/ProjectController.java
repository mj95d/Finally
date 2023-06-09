package com.example.tanfeeth.Controller;

import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Model.Project;
import com.example.tanfeeth.Serveice.MyUserService;
import com.example.tanfeeth.Serveice.ProjectService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RequiredArgsConstructor
    @RestController
    @RequestMapping("/api/v1/project")
    public class ProjectController {

        private final ProjectService projectService;

        @GetMapping("/getAll")
        public ResponseEntity getAll(){
            List<Project> projectList = projectService.getAll();
            return ResponseEntity.status(200).body(projectList);
        }


        @PostMapping("/add")
        public ResponseEntity add(@Valid @RequestBody Project project, Errors errors){
            projectService.add(project, errors);
            return ResponseEntity.status(200).body("project add");
        }



        @PutMapping("/update/{id}")
        public ResponseEntity update(@PathVariable Integer id, @Valid @RequestBody Project project, Errors errors){
            projectService.update(id, project, errors);
            return ResponseEntity.status(200).body("project update");
        }


        @DeleteMapping ("/delete/{id}")
        public ResponseEntity delete(@PathVariable @Valid Integer id){
            projectService.delete(id);
            return ResponseEntity.status(200).body("project deleted");
        }


        @GetMapping("/{id}")
        public ResponseEntity findById(@PathVariable Integer id){
            Optional<Project> project = projectService.findById(id);
            if(project.isPresent()){
                return ResponseEntity.status( HttpStatus.OK).body(project.get());
            }
            return ResponseEntity.status(200).body("Project not found");
        }

    }


