package com.example.tanfeeth.Controller;

import com.example.tanfeeth.Model.InNeedCompany;
import com.example.tanfeeth.Model.OperationCompany;
import com.example.tanfeeth.Repository.OperationCompanyRepository;
import com.example.tanfeeth.Serveice.InNeedCompanyService;
import com.example.tanfeeth.Serveice.OperationCompanyService;
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
@RequestMapping("/api/v1/operation-company")
public class OperationCompanyController {

    private final OperationCompanyService operationCompanyService;

    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        List<OperationCompanyRepository> operationCompanyList = operationCompanyService.getAll();
        return ResponseEntity.status(200).body(operationCompanyList);
    }

    @PostMapping("/add")
    public ResponseEntity add(@Valid @RequestBody OperationCompany operationCompany, Errors errors){
        if(errors.hasErrors()){
            return ResponseEntity.status( HttpStatus.BAD_REQUEST).body(errors.getAllErrors());
        }
        OperationCompanyService.add(operationCompany);
        return ResponseEntity.status(200).body("OperationCompany update");
    }


    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @Valid @RequestBody OperationCompany operationCompany, Errors errors){
        operationCompanyService.update(id, operationCompany, errors);
        return ResponseEntity.status(200).body("OperationCompany update");
    }


    @DeleteMapping ("/delete/{id}")
    public ResponseEntity delete(@PathVariable @Valid Integer id){
        operationCompanyService.delete(id);
        return ResponseEntity.status(200).body("OperationCompany deleted");
    }

    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable Integer id){
        Optional<OperationCompanyRepository> operationCompany = operationCompanyService.findById(id);
        if(operationCompany.isPresent()){
            return ResponseEntity.status(HttpStatus.OK).body(operationCompany.get());
        }
        return ResponseEntity.status(200).body("OperationCompany not found");
    }

}

