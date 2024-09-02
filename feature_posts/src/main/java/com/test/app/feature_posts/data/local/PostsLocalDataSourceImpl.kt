package com.test.app.feature_posts.data.local

import com.test.app.feature_posts.models.Post
import com.test.app.storage.db.PostDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PostsLocalDataSourceImpl @Inject constructor(
    private val postDao: PostDao
) : PostsLocalDataSource {

    override val posts
        get() = postDao.getAllPosts().map {
            it.map { postEntity -> postEntity.toPost() }
        }

    override val savedPostId: Int
        get() = postId

    private var postId: Int = -1

    override fun getPost(id: Int): Flow<Post?> =
        postDao.getPostById(id).map { it?.toPost() }

    override suspend fun savePosts(posts: List<Post>) {
        postDao.updatePosts(posts.map { it.toPostEntity() })
    }

    override fun savePostId(id: Int) {
        postId = id
    }
}