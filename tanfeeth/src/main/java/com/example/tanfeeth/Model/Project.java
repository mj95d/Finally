package com.example.tanfeeth.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@AllArgsConstructor
@Setter
@Getter
@RequiredArgsConstructor
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "operation_company_id",referencedColumnName = "id")
    private OperationCompany operationCompany;
    @ManyToOne
    @JsonIgnore
    @JoinColumn(name = "in_need_company_id",referencedColumnName = "id")
    private InNeedCompany inNeedCompany;
    @OneToMany(mappedBy = "project",cascade = CascadeType.DETACH )
    @PrimaryKeyJoinColumn
    private Set<Staff> staffs;
}
