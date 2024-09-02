package com.test.app.feature_post_details

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.test.app.feature_post_details.models.Post
import com.test.app.feature_post_details.usecases.GetPostDetails
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class PostDetailsViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle,
    getPost: GetPostDetails
) :
    ViewModel() {
    private val postId = savedStateHandle.get<String>("postId")?.toIntOrNull() ?: -1
    var post: Flow<Post?> = getPost(postId)
}