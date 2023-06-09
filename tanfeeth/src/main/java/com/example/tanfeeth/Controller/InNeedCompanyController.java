package com.example.tanfeeth.Controller;

import com.example.tanfeeth.Model.InNeedCompany;
import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Serveice.InNeedCompanyService;
import com.example.tanfeeth.Serveice.MyUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
@RequestMapping("/api/v1/in-need-company")
public class InNeedCompanyController {

    private final InNeedCompanyService inNeedCompanyService;

    @GetMapping("/getAll")
    public ResponseEntity getAll(){
        List<InNeedCompany> inNeedCompanyList = inNeedCompanyService.getAll();
        return ResponseEntity.status(200).body(inNeedCompanyList);
    }


    @PostMapping("/add")
    public ResponseEntity add(@Valid @RequestBody InNeedCompany inNeedCompany, Errors errors){
        inNeedCompanyService.add(inNeedCompany, errors);
        return ResponseEntity.status(200).body("inNeedCompany add");
    }



    @PutMapping("/update/{id}")
    public ResponseEntity update(@PathVariable Integer id, @Valid @RequestBody InNeedCompany inNeedCompany, Errors errors){
        inNeedCompanyService.update(id, inNeedCompany, errors);
        return ResponseEntity.status(200).body("inNeedCompany update");
    }


    @DeleteMapping ("/delete/{id}")
    public ResponseEntity delete(@PathVariable @Valid Integer id){
        inNeedCompanyService.delete(id);
        return ResponseEntity.status(200).body("inNeedCompany deleted");
    }
}
