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
public class InNeedCompany {
    @Id
    private Integer id;
    @OneToOne
    @MapsId
    @JsonIgnore
    private MyUser inNeedUser;

    @OneToMany(mappedBy = "inNeedCompany",cascade = CascadeType.DETACH )
    @PrimaryKeyJoinColumn
    private Set<InNeedCompany> requestSet;
    @OneToMany(mappedBy = "inNeedCompany",cascade = CascadeType.DETACH )
    @PrimaryKeyJoinColumn
    private Set<Project> projectSet ;
}