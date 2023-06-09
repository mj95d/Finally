package com.example.tanfeeth.Serveice;

import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Repository.MyUserRepository;
import lombok.AllArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;
import java.util.Optional;

import static com.example.tanfeeth.Repository.MyUserRepository.*;

@Service
@AllArgsConstructor
public class MyUserService {


    private final MyUserRepository myUserRepository;

        public void add(MyUser myUser){
            myUserRepository.save(myUser);
        }

        public void delete(Integer id){
            myUserRepository.deleteById(id);
        }

        public List<MyUser> findAll(){
            return myUserRepository.findAll();
        }

        public Optional<MyUser> findById(Integer id){
            return myUserRepository.findById(id);
        }
    }
