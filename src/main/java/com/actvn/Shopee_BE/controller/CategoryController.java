package com.actvn.Shopee_BE.controller;

import com.actvn.Shopee_BE.dto.request.CategoryRequest;
import com.actvn.Shopee_BE.entity.Category;
import com.actvn.Shopee_BE.service.CategoryService;
import com.actvn.Shopee_BE.dto.response.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    CategoryService categoryService;

    @GetMapping("/public/categories")
    public ApiResponse getCategories(){
        return categoryService.getAllCategories();
    }

    @GetMapping("/public/categories/{id}")
    public ApiResponse getCategories(@PathVariable String id){
        return categoryService.getCategoryById(id);
    }

    @PostMapping("/admin/categories")
    public ResponseEntity<ApiResponse> addCategory(@RequestBody CategoryRequest request){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body( categoryService.createNewCategory(request));

    }
}
