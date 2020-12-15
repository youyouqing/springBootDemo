package com.dzc.Service;

import com.dzc.Mapper.BooksMapper;
import com.dzc.Models.BookModel;
import com.dzc.Models.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProdService {

    @Autowired
    private BooksMapper booksMapper;

    public List<BookModel> getList(Integer page, Integer pageSize)
    {
//        List<ProductModel> list = new ArrayList<ProductModel>();
//        list.add(new ProductModel(1,"架构师成长之路"));
//        list.add(new ProductModel(2,"SpringBoot学习之路"));

        //        BooksMapper.sel
//        new

        return booksMapper.selectList(null);
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
