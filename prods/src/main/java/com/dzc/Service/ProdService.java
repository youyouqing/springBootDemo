package com.dzc.Service;

import com.dzc.Models.ProductModel;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdService {

    public List<ProductModel> getList()
    {
        List<ProductModel> list = new ArrayList<ProductModel>();
        list.add(new ProductModel(1,"架构师成长之路"));
        list.add(new ProductModel(2,"SpringBoot学习之路"));
        return list;
    }

    public ProductModel getProduct(String id)
    {
        return new ProductModel(2,"SpringBoot学习之路" + id);
    }

    @Async
    public void setProdMeta(String pid, String metaKey) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("异步测试");
    }
}
