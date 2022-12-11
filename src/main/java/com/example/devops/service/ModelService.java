package com.example.devops.service;

import com.example.devops.model.Model;
import com.example.devops.rep.ModelRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ModelService {

    @Autowired
    private ModelRep modelRep;

    public Model saveModel(Model model) {
        return modelRep.save(model);
    }

    public List<Model> getAll() {
        return modelRep.findAll();
    }
}
