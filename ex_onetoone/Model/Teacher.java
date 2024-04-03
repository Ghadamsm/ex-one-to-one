package com.example.ex_onetoone.Model;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Teacher {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id ;


    @NotEmpty(message = "name should be not empty")
    @Column(columnDefinition = "varchar(15) not null")
    private String name ;


    @NotNull(message = "age should be not empty")
    @Positive
    @Column(columnDefinition = "int not null")
    private Integer age ;


    @Email
    @Column(columnDefinition = "varchar(35) not null unique")
    private String email ;


    @NotNull(message = "salary should be not empty")
    @Positive
    @Column(columnDefinition = "int not null")
    private Integer salary ;



    @OneToOne(cascade = CascadeType.ALL , mappedBy = "teacher")
    @PrimaryKeyJoinColumn
    private Address address ;

}
