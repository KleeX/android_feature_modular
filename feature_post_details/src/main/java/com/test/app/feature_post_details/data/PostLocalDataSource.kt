package com.test.app.feature_post_details.data

import com.test.app.feature_post_details.models.Post
import kotlinx.coroutines.flow.Flow

interface PostLocalDataSource {
    fun getPost(id: Int): Flow<Post?>
}