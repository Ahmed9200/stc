package com.example.stc.controller;


import com.example.stc.srvices.ItemServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/stc")
public class StcController {

@Autowired
    ItemServices itemServices;


    @PostMapping(value = "/stc-assessments", produces = {"application/json"})
    @ResponseBody
    public Object stcAssessments() {
        return null;
    }


}
