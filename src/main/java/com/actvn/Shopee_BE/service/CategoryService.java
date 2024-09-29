package com.actvn.Shopee_BE.service;

import com.actvn.Shopee_BE.dto.request.CategoryRequest;
import com.actvn.Shopee_BE.dto.response.ApiResponse;

public interface CategoryService {
    ApiResponse getAllCategories();
    ApiResponse createNewCategory(CategoryRequest categoryRequest);

    ApiResponse getCategoryById(String id);
}
