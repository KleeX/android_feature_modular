package com.test.app.feature_posts

import androidx.lifecycle.ViewModel
import com.test.app.feature_posts.models.Post
import com.test.app.feature_posts.usecases.GetDataUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class PostListViewModel @Inject constructor(getDataUseCase: GetDataUseCase) :
    ViewModel() {

    var posts: Flow<List<Post>> = getDataUseCase()
}