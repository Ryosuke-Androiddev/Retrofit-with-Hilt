package com.example.retrofitwithhilt.network

import com.example.retrofitwithhilt.model.Post
import retrofit2.http.GET

interface PostApiService {

    @GET("posts")
    suspend fun getPost(): List<Post>
}