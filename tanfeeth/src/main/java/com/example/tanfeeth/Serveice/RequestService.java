package com.example.tanfeeth.Serveice;

import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Model.Request;
import com.example.tanfeeth.Repository.MyUserRepository;
import com.example.tanfeeth.Repository.RequestRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;


    @Service
    @AllArgsConstructor
    public class RequestService {

        private final RequestRepository requestRepository;



        public List<Request> getAll(){
            return requestRepository.findAll();
        }

        public void add(Request request, Errors errors){

        }

        public void update(Integer id,Request request,Errors errors){

        }


        public void delete(Integer id) {
        }


        public Optional<Request> findById(Integer id){
            return requestRepository.findById(id);
        }
    }



