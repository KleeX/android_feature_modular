package com.test.app.feature_posts.data.remote

import com.test.app.feature_posts.models.Post
import javax.inject.Inject

class PostsRemoteDataSourceImpl @Inject constructor(private val postsAPI: PostsAPI) :
    PostsRemoteDataSource {

    override suspend fun getPosts(): List<Post> = postsAPI.getPosts()
}