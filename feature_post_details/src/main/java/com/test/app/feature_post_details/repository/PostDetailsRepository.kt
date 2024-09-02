package com.test.app.feature_post_details.repository

import com.test.app.feature_post_details.models.Post
import kotlinx.coroutines.flow.Flow

interface PostDetailsRepository {
    fun getPost(id: Int): Flow<Post?>
}