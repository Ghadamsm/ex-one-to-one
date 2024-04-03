package com.example.ex_onetoone.Repository;

import com.example.ex_onetoone.Model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address , Integer> {


    Address findAddressById(Integer id);
}
