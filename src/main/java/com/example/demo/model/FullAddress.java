package com.example.demo.model;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "address")
public class FullAddress{  
  
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private UUID uuid;
  
  @Column(name = "city")
  private String city; 
  
  @Column(name = "neighborhood")
  private String neighborhood;
  
  @Column(name = "state")
  private String state;

  @Column(name = "zip_code")
  private String zipCode;
  
  @Column(name = "area_state")
  private String areaState;
  
  @Column(name = "ibge_code_state")
  private String ibgeCodeState;
  
  @Column(name = "name_state")
  private String nameState;
  
  @Column(name = "area_city")
  private String areaCity;
  
  @Column(name = "ibge_code_city")
  private String ibgeCodeCity;

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getNeighborhood() {
    return neighborhood;
  }

  public void setNeighborhood(String neighborhood) {
    this.neighborhood = neighborhood;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getZipCode() {
    return zipCode;
  }

  public void setZipCode(String zipCode) {
    this.zipCode = zipCode;
  }

  public String getAreaState() {
    return areaState;
  }

  public void setAreaState(String areaState) {
    this.areaState = areaState;
  }

  public String getIbgeCodeState() {
    return ibgeCodeState;
  }

  public void setIbgeCodeState(String ibgeCodeState) {
    this.ibgeCodeState = ibgeCodeState;
  }

  public String getNameState() {
    return nameState;
  }

  public void setNameState(String nameState) {
    this.nameState = nameState;
  }

  public String getAreaCity() {
    return areaCity;
  }

  public void setAreaCity(String areaCity) {
    this.areaCity = areaCity;
  }

  public String getIbgeCodeCity() {
    return ibgeCodeCity;
  }

  public void setIbgeCodeCity(String ibgeCodeCity) {
    this.ibgeCodeCity = ibgeCodeCity;
  }

  public FullAddress(String city, String neighborhood, String state, String zipCode,
      String areaState, String ibgeCodeState, String nameState, String areaCity,
      String ibgeCodeCity) {
    super();
    this.city = city;
    this.neighborhood = neighborhood;
    this.state = state;
    this.zipCode = zipCode;
    this.areaState = areaState;
    this.ibgeCodeState = ibgeCodeState;
    this.nameState = nameState;
    this.areaCity = areaCity;
    this.ibgeCodeCity = ibgeCodeCity;
    }  
  }
