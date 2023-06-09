package com.example.tanfeeth.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "operation_company_id",referencedColumnName = "id")
    private OperationCompany operationCompany;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "project_id",referencedColumnName = "id")
    private Project project;
}