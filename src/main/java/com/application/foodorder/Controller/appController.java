package com.application.foodorder.Controller;

import com.application.foodorder.Model.appModel;
import com.application.foodorder.Service.appService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home")
public class appController {
    @Autowired
    appService service;

    @PostMapping("/data")
    public appModel insert(@RequestBody appModel model){
        return this.service.insertData(model);
    }

    @GetMapping
    public List<appModel> getMethod(){
        return this.service.get();
    }

    @GetMapping("{email}")
    public appModel getParticularRecord(@PathVariable (value="email") String email){
        return this.service.getParticularRecords(email);
    }

    @GetMapping("validate/{email}")
    public String validate(@PathVariable (value="email") String email){
        return this.service.validateEmail(email);
    }



}
