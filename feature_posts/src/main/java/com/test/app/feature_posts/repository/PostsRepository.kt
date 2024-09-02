package com.test.app.feature_posts.repository

import com.test.app.feature_posts.models.Post
import kotlinx.coroutines.flow.Flow

interface PostsRepository {
    fun getPosts(): Flow<List<Post>>
}