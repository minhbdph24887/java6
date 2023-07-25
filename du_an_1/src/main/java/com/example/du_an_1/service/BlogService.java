package com.example.du_an_1.service;

import com.example.du_an_1.model.Blogs;
import com.example.du_an_1.request.blog.CreateBlogRequest;
import com.example.du_an_1.request.blog.UpdateblogRequest;

import java.util.List;

public interface BlogService {

    List<Blogs> getList();

    Blogs insert(final CreateBlogRequest request);

    Blogs update(final UpdateblogRequest request);

    boolean delte(String id);
}
