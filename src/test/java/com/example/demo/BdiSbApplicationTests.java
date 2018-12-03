package com.example.demo;

import java.io.IOException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.demo.service.LottoService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BdiSbApplicationTests {

	@Autowired
	private LottoService ls;
	
	@Test
	public void test() throws IOException{
		ls.getLottoList();
	}
}
