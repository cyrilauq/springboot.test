/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/SpringFramework/RestController.java to edit this template
 */
package com.example.demo.controllers;

import com.example.demo.services.TestServices;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import java.util.ArrayList;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

/**
 *
 * @author cyril
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private TestServices testService;
    
    @Autowired
    public TestController(TestServices testService) {
        this.testService = testService;
    }
    
    @GetMapping()
    public List<String> list() {
        List<String> result = new ArrayList();
        result.add("one");
        result.add("test");
        result.add("is");
        result.add("good");
        return result;
    }
    
    @GetMapping("/{id}")
    @ApiResponse(responseCode = "200", description = "Success get")
    @ApiResponse(responseCode = "400", description = "Bad id")
    public Object get(@PathVariable String id) {
        return testService.format(id);
    }
    
    
    @GetMapping("/rnd")
    public Object getRnd() {
        return testService.getRnd();
    }
    
    @PutMapping("/{id}")
    public ResponseEntity<?> put(@PathVariable String id, @RequestBody Object input) {
        return null;
    }
    
    @PostMapping
    public ResponseEntity<?> post(@RequestBody Object input) {
        return null;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable String id) {
        return null;
    }
    
}
