package com.example.ex_onetoone.Model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Address {

    @Id
    private Integer id ;


    @NotEmpty(message = "area should be not empty")
    @Column(columnDefinition = "varchar(40)")
    private String area ;


    @NotEmpty(message = "street should be not empty")
    @Column(columnDefinition = "varchar(40)")
    private String street ;


    @NotNull(message = "building Number should be not empty")
    @Column(columnDefinition = "int")
    private Integer buildingNumber ;


    @OneToOne
    @MapsId
    @JsonIgnore
    private Teacher teacher;


}
