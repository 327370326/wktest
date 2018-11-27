package com.wk.ssm.service;

import com.wk.ssm.pojo.Category;

import java.util.List;

public interface CategoryService {

    List <Category> list();

    void add(Category c);

    void update(Category c);

    void delete(Category c);

    Category get(int id);


}