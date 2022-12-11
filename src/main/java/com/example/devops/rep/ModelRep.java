package com.example.devops.rep;

import com.example.devops.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ModelRep extends JpaRepository<Model,Long> {
}
