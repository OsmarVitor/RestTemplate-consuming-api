package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.example.demo.model.Address;
import com.example.demo.model.CityInfo;
import com.example.demo.model.FullAddress;
import com.example.demo.model.StateInfo;
import com.example.demo.repository.FullAddressRepository;

@Service
public class ConsumerPostmonApiService {

  @Value("${url.postmon}")
  private String url;

  @Autowired
  FullAddressRepository addresRepository;

  public Address consumer(String cep) {
    String fullUrl = url + cep;
    RestTemplate restTemplate = new RestTemplate();
    Address responseObject = restTemplate.getForObject(fullUrl, Address.class);
    return responseObject;
  }

  public void saveAddress(Address address) {
    StateInfo stateInfo = address.getStateInfo();
    CityInfo cityInfo = address.getCityInfo();

    addresRepository.save(new FullAddress(address.getCity(), address.getNeighborhood(),
        address.getState(), address.getZipCode(), stateInfo.getAreaState(), stateInfo.getIbgeCode(),
        stateInfo.getName(), cityInfo.getAreaCity(), cityInfo.getIbgeCodeCity()));
  }

}
