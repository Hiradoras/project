package com.zeroone.project.controller;

import com.zeroone.project.entity.Tshirt;
import com.zeroone.project.services.TshirtService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(description = "Tshirt api",tags = {"Tshirt"})
@RequestMapping("/api/tshirts")
public class TshirtController {
    private final TshirtService tshirtService;

    public TshirtController(TshirtService tshirtService) {
        this.tshirtService = tshirtService;
    }
    @GetMapping
    @ApiOperation(value = "Get all tshirts")
    private List<Tshirt> findAll(){
        return tshirtService.findAll();

    }
//    @PostMapping
//    private TshirtDto save(@RequestBody TshirtCreateDto tshirtCreateDto) {
//        return tshirtService.save(tshirtCreateDto);
//    }
}
