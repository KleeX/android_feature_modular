package com.test.app.feature_posts.repository

import com.test.app.feature_posts.data.local.PostsLocalDataSource
import com.test.app.feature_posts.data.remote.PostsRemoteDataSource
import com.test.app.feature_posts.models.Post
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.onStart
import javax.inject.Inject

class PostRepoImpl @Inject constructor(
    private val postApi: PostsRemoteDataSource,
    private val postLocalDS: PostsLocalDataSource
) : PostsRepository {

    override fun getPosts(): Flow<List<Post>> {
        return postLocalDS.posts.onStart {
            val posts = postApi.getPosts()
            postLocalDS.savePosts(posts)
        }
    }
}