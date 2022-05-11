
package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.example.demo.model.Address;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ServiceTest {

  @Autowired
  ConsumerPostmonApiService service;

  @Test
  public void shouldSaveAddressOnDatabase() throws Exception {
    Address address = service.consumer("14680000");
    service.saveAddress(address);
   
  }

}
