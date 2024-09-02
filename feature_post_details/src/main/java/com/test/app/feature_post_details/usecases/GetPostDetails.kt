package com.test.app.feature_post_details.usecases

import com.test.app.feature_post_details.models.Post
import kotlinx.coroutines.flow.Flow

interface GetPostDetails {
    operator fun invoke(id: Int): Flow<Post?>
}