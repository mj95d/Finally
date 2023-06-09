package com.example.tanfeeth.Controller;

import com.example.tanfeeth.Model.MyUser;
import com.example.tanfeeth.Serveice.MyUserService;
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
@RequestMapping("/api/v1/myuser")
public class MyUserController {

    private final MyUserService myUserService;

        @PostMapping( "/add" )
        public ResponseEntity add(@Valid @RequestBody MyUser myUser, Errors errors) {
            if (errors.hasErrors( )) {
                return ResponseEntity.status( HttpStatus.BAD_REQUEST ).body( errors.getAllErrors( ) );
            }
            myUserService.add( myUser );
            return ResponseEntity.status(200).body( "MyUser add" );
        }

        @DeleteMapping( "/{id}" )
        public ResponseEntity delete(@PathVariable Integer id) {
            myUserService.delete( id );
            return ResponseEntity.status(200).body( "MyUser delete" );
        }

        @GetMapping( "/findAll" )
        public ResponseEntity findAll() {
            return ResponseEntity.status( HttpStatus.OK ).body( myUserService.findAll( ) );
        }

        @GetMapping( "/{id}" )
        public ResponseEntity findById(@PathVariable Integer id) {
            Optional<MyUser> myUser = myUserService.findById( id );
            if (myUser.isPresent( )) {
                return ResponseEntity.status( HttpStatus.OK ).body( myUser.get( ) );
            }
            return ResponseEntity.status( HttpStatus.NOT_FOUND ).body( "MyUser not found" );
        }
    }


