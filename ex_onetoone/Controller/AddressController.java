package com.example.ex_onetoone.Controller;


import com.example.ex_onetoone.API.ApiResponse;
import com.example.ex_onetoone.DTO.AddressDTO;
import com.example.ex_onetoone.Service.AddressService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/address")
@RequiredArgsConstructor
public class AddressController {


    private final AddressService addressService ;


    @GetMapping("/get")
    public ResponseEntity get(){
        return ResponseEntity.status(200).body(addressService.get());
    }


    @PostMapping("/add")
    public ResponseEntity addProfile(@RequestBody @Valid AddressDTO addressDTO){

        addressService.add(addressDTO);

        return ResponseEntity.status(200).body(new ApiResponse("Address added"));
    }


    @PutMapping("/update")
    public ResponseEntity update(@RequestBody @Valid AddressDTO addressDTO){

        addressService.update(addressDTO);
        return ResponseEntity.status(200).body(new ApiResponse("address updated"));
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){

        addressService.delete(id);
        return ResponseEntity.status(200).body(new ApiResponse("address deleted"));

    }

}
