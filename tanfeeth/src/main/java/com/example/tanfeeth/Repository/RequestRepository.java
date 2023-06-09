package com.example.tanfeeth.Repository;

import com.example.tanfeeth.Model.Request;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface RequestRepository extends JpaRepository<Request,Integer> {
}
