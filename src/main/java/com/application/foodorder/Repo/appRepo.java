package com.application.foodorder.Repo;

import com.application.foodorder.Model.appModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface appRepo extends JpaRepository<appModel,Integer> {
    appModel findByEmail(String email);
}
