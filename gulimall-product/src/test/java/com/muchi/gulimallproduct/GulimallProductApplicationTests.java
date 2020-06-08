package com.muchi.gulimallproduct;

import com.muchi.gulimallproduct.product.entity.Brand;
import com.muchi.gulimallproduct.product.service.IBrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Test
    void contextLoads() {
    }

    @Autowired
    private IBrandService brandService;

    @Test
    public void test(){
        List<Brand> list = brandService.list();
        System.out.println(list);
    }

}
