package com.acg.apiRestShop.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.patch;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

@ExtendWith(SpringExtension.class)
@SpringBootTest
@AutoConfigureMockMvc
//@ContextConfiguration(classes = {PedidoRepositoryTests.class}, loader = AnnotationConfigContextLoader.class)
class PedidoControllerTest {

	
	 @Autowired
	  private MockMvc mockMvc;



	  @Test
	  void pedidosTest() throws Exception {

	    mockMvc.perform(get("/servicio1/pedidos"))
	            .andExpect(status().isOk());

	  }
	  
	  @Test
	  void pedidoTest() throws Exception {

	    mockMvc.perform(get("/servicio1/pedido/1"))
	            .andExpect(status().isOk());

	  }
	  
	  @Test
	  void pedidoTestFail() throws Exception {

	    mockMvc.perform(get("/servicio1/pedido/cadena"))
	            .andExpect(status().isBadRequest());

	  }
	  
//	  @Test
//	  void pedidoBorrar() throws Exception {
//
//	    mockMvc.perform(patch("/servicio1/pedido/borrar"))
//	            .andExpect(status().isOk());
//
//	  }
	  
	  
}
