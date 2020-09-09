package edu.frostburg.itec442.ecommerce.controller;

import edu.frostburg.itec442.ecommerce.model.Merchandise;
import edu.frostburg.itec442.ecommerce.service.MerchandiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MerchandiseController {

    @Autowired
    MerchandiseService merchandiseService;


    @GetMapping("/merchandise/new")
    public String create(){

        Merchandise merchandise = new Merchandise();
        merchandise.setTitle("Apple iPhone 11");
        merchandise.setDescription("This is a phone");
        merchandise.setUPC("APP000001");
        merchandise.setPrice(999.00f);

        merchandiseService.save(merchandise);

        return "SUCCESS";
    }
}
