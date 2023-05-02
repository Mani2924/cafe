package com.twilight.cafe;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import com.twilight.cafe.entity.Item;
import com.twilight.cafe.repository.ItemRepository;
import com.twilight.cafe.service.ItemImplementation;

@SpringBootTest
class CafeApplicationTests {
	@MockBean
	private ItemImplementation itemImplementation;
	
	@Mock
	private ItemRepository itemRepository;
	@Test
	void contextLoads() {
	}

	  @Test
      void findById_should_return_employee() {
          // When
          Optional<Item> employee = this.itemRepository.findById(null);
          // Then
          System.out.println(employee);
      }

}
