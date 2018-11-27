package com.wk.ssm.service.impl;

import com.wk.ssm.mapper.CategoryMapper;
import com.wk.ssm.pojo.Category;
import com.wk.ssm.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Override
    public List <Category> list() {
        return categoryMapper.list();
    }

    @Override
    public void add(Category c) {
        categoryMapper.add(c);
    }

    @Override
    public void update(Category c) {
        categoryMapper.update(c);
    }

    @Override
    public void delete(Category c) {
        categoryMapper.delete(c.getId());
    }

    @Override
    public Category get(int id) {
        return categoryMapper.get(id);
    }

}