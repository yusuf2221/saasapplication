package com.saas.application.controller;

import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.saas.application.security.RequestAuthorization;
import com.saas.application.tenant.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController implements Serializable {

    private static final long serialVersionUID = 2671209257234168763L;

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    @Autowired
    ProductService  productService;

    @RequestAuthorization
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public ResponseEntity<Object> getAllProduct() {
        LOGGER.info("getAllProduct() method call...");
        return new ResponseEntity<>(productService.getAllProduct(),HttpStatus.OK);
    }

}
