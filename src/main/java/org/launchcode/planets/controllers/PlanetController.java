package org.launchcode.planets.controllers;

import org.launchcode.planets.models.Planet;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@CrossOrigin
public class PlanetController {

    Planet p1 = new Planet("Earth", 12756, "Sun", 149600000, "https://upload.wikimedia.org/wikipedia/commons/6/60/Earth_from_Space.jpg", 1);
    Planet p2 = new Planet("Mars", 4200, "Sun", 227900000, "https://mars.nasa.gov/system/resources/detail_files/7808_global-color-views-mars-PIA00407-full2.jpg", 2);
    Planet p3 = new Planet("Saturn", 120536, "Sun", 1433500000, "https://solarsystem.nasa.gov/system/resources/detail_files/16278_PIA20016.jpg", 146);
    Planet p4 = new Planet("Jupiter", 142984, "Sun", 778600000, "https://apod.nasa.gov/apod/image/1609/Europa_Galileo_960.jpg", 95);
    Planet p5 = new Planet("Kypton", 232432, "Rao", 234234323, "https://static.wikia.nocookie.net/krypton-series/images/2/21/Krypton_%28Planet%29.png/revision/latest?cb=20180411204524", 2);
    Planet p6 = new Planet("Skaro", 3452134, "Seventh", 245623452, "https://static.wikia.nocookie.net/tardis/images/4/4a/Skaro.jpg/revision/latest?cb=20120405231507", 5);

    List<Planet> planets = Arrays.asList(p1, p2, p3, p4, p5, p6);

    @GetMapping
    public List<Planet> getAllPlanets(){
        return planets;
    }
}
