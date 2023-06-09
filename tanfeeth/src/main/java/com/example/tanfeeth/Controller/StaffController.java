package com.example.tanfeeth.Controller;

import com.example.tanfeeth.Model.Request;
import com.example.tanfeeth.Model.Staff;
import com.example.tanfeeth.Serveice.StaffService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/staff")
public class StaffController {

    private final StaffService staffService;


    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        List<Staff> requestList = staffService.getAll();
        return ResponseEntity.status(200).body("staff getAll");
    }


    @PostMapping("/add")
    public ResponseEntity add(@Valid @RequestBody Staff staff, Errors errors){
        staffService.add(staff, errors);
        return ResponseEntity.status(200).body("staff add");
    }



    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @Valid @RequestBody Staff staff, Errors errors){
        staffService.update(id, staff, errors);
        return ResponseEntity.status(200).body("staff update");
    }


    @DeleteMapping ("/delete/{id}")
    public ResponseEntity delete(@PathVariable @Valid Integer id){
        staffService.delete(id);
        return ResponseEntity.status(200).body("staff deleted");
    }
}


