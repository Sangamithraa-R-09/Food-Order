package com.application.foodorder.Service;

import com.application.foodorder.Model.appModel;
import com.application.foodorder.Repo.appRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class appService {
    @Autowired
    appRepo repo;

    public appModel insertData(appModel model){
        return this.repo.save(model);
    }

    public List<appModel> get(){
        return this.repo.findAll();
    }

    public appModel getParticularRecords(String email){
        return this.repo.findByEmail(email);
    }

    public String validateEmail(String email){
        appModel record = repo.findByEmail(email);
        if(record==null){
            return "true";
        }
        else{
            return "false";
        }
    }



}
