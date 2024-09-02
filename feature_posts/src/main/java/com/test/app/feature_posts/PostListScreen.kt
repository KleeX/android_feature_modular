package com.test.app.feature_posts

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun PostListScreen(openPostDetails: (Int) -> Unit) {
    val viewModel = hiltViewModel<PostListViewModel>()
//    val navController = LocalNavController.current
    val posts = viewModel.posts.collectAsState(listOf())
    LazyColumn {
        items(posts.value) { post ->
            Column(modifier = Modifier
                .clickable {
                    openPostDetails(post.id)
                }
                .fillMaxSize()
                .background(Color.White)) {
                Text(text = post.title)
                Text(text = post.body)
                HorizontalDivider()
                Spacer(modifier = Modifier.height(16.dp))
            }
        }
    }

}