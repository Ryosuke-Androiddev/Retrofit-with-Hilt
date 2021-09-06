package com.example.retrofitwithhilt.network

import com.example.retrofitwithhilt.model.Post
import javax.inject.Inject

class PostServiceImp @Inject constructor(private val postApiService: PostApiService) {

    suspend fun getPost(): List<Post> = postApiService.getPost()
}