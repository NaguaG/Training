package org.example.homework1.Service;

import jakarta.annotation.PostConstruct;
import org.example.homework1.Exception.ResourceNotFoundException;
import org.example.homework1.Pojo.Product;
import org.example.homework1.Pojo.dto.ProductDTO;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@org.springframework.stereotype.Service
public class ProductService {

    private final RestTemplate restTemplate;
    private Product[] listOfProduct;

    public ProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;

    }
    @PostConstruct
    public void init(){
        String url = "https://api.restful-api.dev/objects";
        this.listOfProduct = restTemplate.getForObject(url, Product[].class);
    }
    public ProductDTO getProductById(String id){
        return Arrays.stream(listOfProduct).filter(p-> p.getId().equals(id))
                .map(p-> new ProductDTO(p.getName()))
                .findAny().orElseThrow(() ->new ResourceNotFoundException("Product with " + id + " not found"));
    }
    public ProductDTO getProductByName(String name){
        return Arrays.stream(this.listOfProduct).filter(p -> p.getName().equals(name))
                .map(p-> new ProductDTO(p.getName()))
                .findAny().orElseThrow(()-> new ResourceNotFoundException("Product not found"));
    }

    public ProductDTO[] getAllProduct(){
        return Arrays.stream(this.listOfProduct).map(p -> new ProductDTO(p.getName()))
                .toArray(ProductDTO[]::new);
    }
    public double getAppleProductsTotalPrice(){
        return Arrays.stream(listOfProduct).filter(p-> p.getName().contains("Apple"))
                .map(p->p.getData() != null ? p.getData().price : 0.0)
                .reduce(0.0, Double::sum);
    }




}
