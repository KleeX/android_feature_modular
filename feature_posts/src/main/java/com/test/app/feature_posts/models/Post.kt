package com.test.app.feature_posts.models

data class Post(
    val id: Int,
    val userId: String,
    val title: String,
    val body: String
) {
    override fun toString(): String {
        return "Post(id=$id, userId='$userId', title='$title', body='$body')"
    }
}