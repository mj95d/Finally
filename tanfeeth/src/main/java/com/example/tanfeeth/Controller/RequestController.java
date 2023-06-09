package com.example.tanfeeth.Controller;

import com.example.tanfeeth.Model.Project;
import com.example.tanfeeth.Model.Request;
import com.example.tanfeeth.Serveice.ProjectService;
import com.example.tanfeeth.Serveice.RequestService;
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
@RequestMapping("/api/v1/request")
public class RequestController {

    private final RequestService requestService;

    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        List<Request> requestList = requestService.getAll();
        return ResponseEntity.status(200).body(requestList);
    }


    @PostMapping("/add")
    public ResponseEntity add(@Valid @RequestBody Request request, Errors errors){
        requestService.add(request, errors);
        return ResponseEntity.status(200).body("Request add");
    }



    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @Valid @RequestBody Request request, Errors errors){
        requestService.update(id, request, errors);
        return ResponseEntity.status(200).body("Request update");
    }


    @DeleteMapping ("/delete/{id}")
    public ResponseEntity delete(@PathVariable @Valid Integer id){
        requestService.delete(id);
        return ResponseEntity.status(200).body("Request deleted");
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Integer id){
        Optional<Request> request = requestService.findById(id);
        if(request.isPresent()){
            return ResponseEntity.status( HttpStatus.OK).body(request.get());
        }
        return ResponseEntity.status(200).body("Request not found");
    }
}




