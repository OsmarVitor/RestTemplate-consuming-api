package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Address {
    
    @JsonProperty("cidade") 
    private String city;
    
    @JsonProperty("bairro")
    private String neighborhood;
    
    @JsonProperty("estado")
    private String state;
    
    @JsonProperty("cep")
    private String zipCode; 
   
    @JsonProperty("estado_info")
    private StateInfo stateInfo;

    @JsonProperty("cidade_info")
    private CityInfo cityInfo;
    
    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public StateInfo getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(StateInfo stateInfo) {
        this.stateInfo = stateInfo;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public CityInfo getCityInfo() {
        return cityInfo;
    }

    public void setCityInfo(CityInfo cityInfo) {
        this.cityInfo = cityInfo;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
      return "Address [neighborhood=" + neighborhood + ", city=" + city + ", stateInfo=" + stateInfo
          + ", zipCode=" + zipCode + ", cityInfo=" + cityInfo + ", state=" + state + "]";
    }
    
    
    
}
