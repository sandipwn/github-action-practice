package com.example.radical;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class aws {
    @GetMapping("/aws")
    public String aws()
    {
        return "route53,ec2,lambda,efs,new changes for maven,new changes for maven build trigger......";
    }
}
