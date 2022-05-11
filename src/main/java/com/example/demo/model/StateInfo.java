package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StateInfo {

  @JsonProperty("area_km2")
  private String areaState;

  @JsonProperty("codigo_ibge")
  private String ibgeCodeState;

  @JsonProperty("nome")
  private String name;

  public String getAreaState() {
    return areaState;
  }

  public void setAreaState(String areaState) {
    this.areaState = areaState;
  }

  public String getIbgeCode() {
    return ibgeCodeState;
  }

  public void setIbgeCode(String ibgeCode) {
    this.ibgeCodeState = ibgeCode;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "StateInfo [areaSate=" + areaState + ", ibgeCode=" + ibgeCodeState + ", name=" + name + "]";
  }

}
