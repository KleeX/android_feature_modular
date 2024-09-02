package com.test.app.feature_posts.data.remote

import com.test.app.feature_posts.models.Post
import retrofit2.http.GET

interface PostsAPI {

    @GET("posts")
    suspend fun getPosts(): List<Post>

//    @GET("posts/{id}")
//    suspend fun getPost(id: Int): Post
}