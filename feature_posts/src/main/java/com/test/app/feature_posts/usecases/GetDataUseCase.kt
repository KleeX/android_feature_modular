package com.test.app.feature_posts.usecases

import com.test.app.feature_posts.models.Post
import kotlinx.coroutines.flow.Flow

interface GetDataUseCase {
    operator fun invoke(): Flow<List<Post>>
}