package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityInfo {
    
    @JsonProperty("area_km2")
    private String areaCity;
    
    @JsonProperty("codigo_ibge")
    private String ibgeCodeCity;

    public String getAreaCity() {
        return areaCity;
    }

    public void setAreaCity(String area) {
        this.areaCity = area;
    }

    public String getIbgeCodeCity() {
        return ibgeCodeCity;
    }

    public void setIbgeCodeCity(String ibgeCodeCity) {
        this.ibgeCodeCity = ibgeCodeCity;
    }

    @Override
    public String toString() {
      return "CityInfo [areaCity=" + areaCity + ", ibgeCityCode=" + ibgeCodeCity + "]";
    }
    
}
