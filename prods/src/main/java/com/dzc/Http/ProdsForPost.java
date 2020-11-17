package com.dzc.Http;

import com.dzc.Models.ProductModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/prods")
public class ProdsForPost {

    @PostMapping()
    public ProductModel newProd(@RequestBody @Valid ProductModel productModel)
    {
        return productModel;
    }
}
