package com.flamexander.cloud.client.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

//geek-spring-cloud-eureka-feign-client
@FeignClient("geek-spring-cloud-summer-market")
public interface CategoryClient {
    @RequestMapping("/summermarket/get-category/{id}")
    Category getCategory(@PathVariable Integer id);

    @RequestMapping("/summermarket/get-categories")
    List<Category> getAllCategories();
}
