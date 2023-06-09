package com.example.tanfeeth.Serveice;

import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Model.Staff;
import com.example.tanfeeth.Repository.StaffRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.validation.Errors;

import java.util.List;

    @Service
    @AllArgsConstructor
    public class StaffService {

        private final StaffRepository staffRepository;


        public List<Staff> getAll() {
            return staffRepository.findAll( );
        }

        public void add(Staff staff, Errors errors) {

        }

        public void update(Integer id, Staff staff, Errors errors) {

        }


        public void delete(Integer id) {
        }

    }