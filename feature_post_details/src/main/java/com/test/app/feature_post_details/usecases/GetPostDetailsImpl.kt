package com.test.app.feature_post_details.usecases

import com.test.app.feature_post_details.models.Post
import com.test.app.feature_post_details.repository.PostDetailsRepository
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class GetPostDetailsImpl @Inject constructor(private val postRepo: PostDetailsRepository) :
    GetPostDetails {
    override operator fun invoke(id: Int): Flow<Post?> = postRepo.getPost(id)
}