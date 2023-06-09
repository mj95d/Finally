package com.example.tanfeeth.Serveice;

import com.example.tanfeeth.Model.OperationCompany;
import com.example.tanfeeth.Repository.OperationCompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

@Service
    @AllArgsConstructor
    public class OperationCompanyService {

        private final OperationCompanyRepository operationCompanyRepository;



        public List<OperationCompanyRepository> getAll(){
            return operationCompanyRepository.findAll();
        }

        public static void add(OperationCompany operationCompany) {
        }

        public static void add(OperationCompany operationCompany,Errors errors){
            if(errors.hasErrors()){
                throw new RuntimeException("Error");
            }
        }


        public void update(Integer id,OperationCompany operationCompany,Errors errors){

        }


        public void delete(Integer id) {
        }


        public Optional<OperationCompanyRepository> findById(Integer id){
            return operationCompanyRepository.findById(id);
        }
    }


