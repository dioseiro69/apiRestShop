package com.acg.apiRestShop.repository;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Optional;

import com.acg.apiRestShop.model.Articulo;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
class ArticuloRepositoryTests {

	@Autowired
	private ArticuloRepository articuloRepository;


	  
	  @Test
	  void getArticuloTest() throws Exception {
		  Optional<Articulo> articulo = articuloRepository.findById(1);
		  
		  assertNotNull(articulo);
	  }
	  
}
