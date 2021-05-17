package com.pagination.controllers;

import com.pagination.dto.ProductDetails;
import com.pagination.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//http://localhost:8081/fetchAllProduct?pageSize=1


@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("fetchAllProduct")
    public ResponseEntity<List<ProductDetails>> fetchAllEmployee(
        @RequestParam(defaultValue = "0") Integer pageNo,
        @RequestParam(defaultValue = "10") Integer pageSize,
        @RequestParam(defaultValue = "id") String sortBy

    ){
        List<ProductDetails> employeeDetailsList=productService.fetchAllEmployees(pageNo,pageSize,sortBy);

        return new ResponseEntity<List<ProductDetails>>(employeeDetailsList,new HttpHeaders(), HttpStatus.OK);

    }
}
