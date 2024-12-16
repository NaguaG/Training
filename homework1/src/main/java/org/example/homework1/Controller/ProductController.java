package org.example.homework1.Controller;

import org.example.homework1.Pojo.dto.ProductDTO;
import org.example.homework1.Service.ProductService;
import org.example.homework1.Pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "products")
public class ProductController {
    private ProductService service;

    @Autowired
    public ProductController(ProductService service){
        this.service = service;
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<ProductDTO> getProductById(@PathVariable("id") String id){
        return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<ProductDTO> getProductByName(@RequestParam String name){
        return new ResponseEntity<>(service.getProductByName(name),HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<ProductDTO[]> getTestData(){
        return new ResponseEntity<>(service.getAllProduct(), HttpStatus.OK);
    }
    @GetMapping("/appleTotalPrice")
    public ResponseEntity<Double> getAppleProductTotalPrice(){
        return new ResponseEntity<>(service.getAppleProductsTotalPrice(), HttpStatus.OK);
    }



}
