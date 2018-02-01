package com.hfad.beeradviser;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindBeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_beer);
    }

    public void onClickFindBeer(View view) {
        TextView brands = findViewById(R.id.brands);
        Spinner color = findViewById(R.id.color);
        String beerType = String.valueOf(color.getSelectedItem());
        BeerExpert beerExpert = new BeerExpert();
        List<String> brandsList = beerExpert.getBrands(beerType);
        final StringBuilder brandsFormatted = new StringBuilder();
        for(String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        brands.setText(brandsFormatted);
    }
}
