package com.test.app.feature_post_details.repository

import com.test.app.feature_post_details.data.PostLocalDataSource
import com.test.app.feature_post_details.models.Post
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PostDetailsRepositoryImpl @Inject constructor(private val postDataSource: PostLocalDataSource) :
    PostDetailsRepository {

    // here we could use a remote data source as well
    override fun getPost(id: Int): Flow<Post?> = postDataSource.getPost(id)
}