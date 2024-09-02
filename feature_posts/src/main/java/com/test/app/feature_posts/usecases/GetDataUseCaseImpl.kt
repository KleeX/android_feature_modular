package com.test.app.feature_posts.usecases

import com.test.app.feature_posts.models.Post
import com.test.app.feature_posts.repository.PostsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetDataUseCaseImpl @Inject constructor(private val postRepo: PostsRepository) :
    GetDataUseCase {

    override fun invoke(): Flow<List<Post>> {
        return postRepo.getPosts()
    }
}