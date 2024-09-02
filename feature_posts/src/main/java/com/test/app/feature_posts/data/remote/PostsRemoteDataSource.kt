package com.test.app.feature_posts.data.remote

import com.test.app.feature_posts.models.Post


interface PostsRemoteDataSource {
    suspend fun getPosts(): List<Post>
}