package com.acg.apiRestShop.repository;



import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.Optional;

import com.acg.apiRestShop.model.Pedido;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
//@ContextConfiguration(classes = {PedidoRepositoryTests.class}, loader = AnnotationConfigContextLoader.class)
class PedidoRepositoryTests {

	@Autowired
	private PedidoRepository pedidoRepository;


	  @Test
	  void getPedidosTest() throws Exception {
		  Iterable pedidos = pedidoRepository.findAll();
		  
		  assertNotNull(pedidos);
	 
	  }
	  
	  @Test
	  void getPedidoTest() throws Exception {
		  Optional<Pedido> pedido = pedidoRepository.findById(1);
		  
		  assertNotNull(pedido);
	 
	  }
	  
//	  @Test
//	  void crearPedidoTest() throws Exception {
//		  Pedido pedido = pedidoRepository.save(new Pedido());
//		  
//		  assertNotNull(pedido);
//	 
//	  }
	  
}
