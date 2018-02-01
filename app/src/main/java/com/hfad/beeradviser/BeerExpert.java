package com.hfad.beeradviser;

/**
 * Created by brianmunksgaard on 01/02/2018.
 */

import java.util.List;
import java.util.ArrayList;

public class BeerExpert {

    public List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        if(color.equals("amber")) {
            brands.add("Jack Amber");
            brands.add("Red Moose");
        } else {
            brands.add("Jail Pale Ale");
            brands.add("Gout Stout");
        }
        return brands;
    }
}
