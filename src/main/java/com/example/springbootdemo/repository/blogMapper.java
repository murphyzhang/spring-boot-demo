package com.example.springbootdemo.repository;

import com.example.springbootdemo.domain.blog;
import com.example.springbootdemo.domain.blogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface blogMapper {
    long countByExample(blogExample example);

    int deleteByExample(blogExample example);

    int insert(blog record);

    int insertSelective(blog record);

    List<blog> selectByExample(blogExample example);

    int updateByExampleSelective(@Param("record") blog record, @Param("example") blogExample example);

    int updateByExample(@Param("record") blog record, @Param("example") blogExample example);
}