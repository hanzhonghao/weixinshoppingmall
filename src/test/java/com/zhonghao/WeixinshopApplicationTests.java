package com.zhonghao;

import com.zhonghao.dataobject.ProductCategory;
import com.zhonghao.repository.ProductCategoryRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WeixinshopApplicationTests {

	@Autowired
	private ProductCategoryRepository repository;

	@Test
	public void findOneTest(){
		ProductCategory productCategory = repository.findById(1).get();
		System.out.println(productCategory.toString());
	}

}
