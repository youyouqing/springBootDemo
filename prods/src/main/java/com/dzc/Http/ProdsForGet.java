package com.dzc.Http;

import com.dzc.Mapper.BooksMapper;
import com.dzc.Models.BookModel;
import com.dzc.Models.ProductModel;
import com.dzc.Models.ResultModel;
import com.dzc.Service.ProdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(path = "/prods")
public class ProdsForGet {
    // 注入
    @Autowired
    public ProdsForGet(ProdService prodService, @Qualifier("v2") Map<String, String> versionConfig, BooksMapper booksMapper) {
        this.prodService = prodService;
        this.versionConfig = versionConfig;
        this.booksMapper = booksMapper;
    }

    public final Map<String, String> versionConfig;
    @GetMapping("/test")
    public String test(HttpServletRequest request) throws ClassNotFoundException {
        String test = request.getParameter("test");
        if (test.equals("1")) {
            throw new ClassNotFoundException("测试异常");
        }
        return versionConfig.get("version");
    }

    private final ProdService prodService;

    private final BooksMapper booksMapper;
    @GetMapping("")
    public ResultModel prodList()
    {
        BookModel bookModel = booksMapper.selectById(221);
        return new ResultModel("success", bookModel);
    }

    //prods/2
    @GetMapping("{id:\\d+}")
    public ResultModel getProd(@PathVariable String id) throws InterruptedException {
        this.prodService.setProdMeta(id,"多线程异步测试");
        return new ResultModel("success", this.prodService.getProduct(id));
    }


    @GetMapping("/books")
    public ResultModel bookList(@RequestParam Integer page, @RequestParam Integer pageSize)
    {
        return new ResultModel("success", this.prodService.getList(page, pageSize));
    }

}
