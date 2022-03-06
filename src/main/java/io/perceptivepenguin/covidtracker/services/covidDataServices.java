package io.perceptivepenguin.covidtracker.services;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class covidDataServices {

    private static String VIRUS_DATA_URL = "https://github.com/CSSEGISandData/COVID-19/blob/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_US.csv";

    public void fetchVirusData(){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().
                uri(URI.create(VIRUS_DATA_URL))
                .build();
    }
}
