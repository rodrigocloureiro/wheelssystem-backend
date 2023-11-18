package br.com.wheels.controller;

import br.com.wheels.model.Bike;
import br.com.wheels.service.BikeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bike")
@CrossOrigin
public class BikeController {
    @Autowired
    private BikeService bikeService;

//    @GetMapping("/getBike/{id}")
//    public Bike getBikeById(@RequestParam(required = true) int id) {
//        return bikeService.getBikeById(id);
//    }

    @GetMapping("/getBike/{id}")
    public Bike getBikeById(@PathVariable int id) {
        return bikeService.getBikeById(id);
    }

//    @GetMapping("/getBike/{model}")
//    public Bike getBikeByModel(@RequestParam(required = true) String model) {
//        return bikeService.getBikeByModel(model);
//    }

    @PostMapping("/add")
    public String add(@RequestBody Bike bike) {
        bikeService.saveBike(bike);
        return "New bike is added";
    }
}
