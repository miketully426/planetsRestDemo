package org.launchcode.planets.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Planet {

    private String name;
    private int diameter;
    private String star;
    private int distance;
    private String image;
    private int moons;

}
