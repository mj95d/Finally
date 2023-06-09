package com.example.tanfeeth.Serveice;

import com.example.tanfeeth.Model.InNeedCompany;
import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Repository.InNeedCompanyRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

@Service
    @AllArgsConstructor
    public class InNeedCompanyService {

        private final InNeedCompanyRepository inNeedCompanyRepository;



        public List<InNeedCompany> getAll(){
            return inNeedCompanyRepository.findAll();
        }

        public void add(InNeedCompany inNeedCompany, Errors errors){

        }

        public void update(Integer id,InNeedCompany inNeedCompany,Errors errors){

        }


        public void delete(Integer id) {
        }


        public Optional<InNeedCompany> findById(Integer id){
            return inNeedCompanyRepository.findById(id);
        }
    }



