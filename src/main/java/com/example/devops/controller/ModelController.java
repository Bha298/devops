package com.example.devops.controller;

import com.example.devops.model.Model;
import com.example.devops.service.ModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ModelController {

    @Autowired
    private ModelService modelService;

    @PostMapping
    public Model saveModel(@RequestBody Model model){
        return modelService.saveModel(model);
    }

    @GetMapping
    public List<Model> getAll(){
        return modelService.getAll();
    }
}
