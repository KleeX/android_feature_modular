package com.test.app.feature_post_details.data

import com.test.app.feature_post_details.models.Post
import com.test.app.storage.db.PostDao
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class PostLocalDataSourceImpl @Inject constructor(
    private val postDao: PostDao
) : PostLocalDataSource {
    override fun getPost(id: Int): Flow<Post?> = postDao.getPostById(id).map { post ->
        post?.let { Post(it.id, it.userId, it.title, it.body) }
    }
}