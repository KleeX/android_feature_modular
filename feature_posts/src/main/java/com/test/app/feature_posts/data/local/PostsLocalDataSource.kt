package com.test.app.feature_posts.data.local

import com.test.app.feature_posts.models.Post
import kotlinx.coroutines.flow.Flow

interface PostsLocalDataSource {
    val posts: Flow<List<Post>>
    val savedPostId: Int
    fun getPost(id: Int): Flow<Post?>
    suspend fun savePosts(posts: List<Post>)
    fun savePostId(id: Int)
}