package com.dzc.Models;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "books")
public class BookModel {

    @TableId(value = "book_id", type = IdType.AUTO)
    private int bookId;

    @TableField(value = "book_name")
    private String bookName;


}
