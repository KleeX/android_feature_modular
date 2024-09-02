package com.test.app.feature_posts.data.local

import com.test.app.feature_posts.models.Post
import com.test.app.storage.db.PostEntity


fun PostEntity.toPost(): Post = Post(
    id = id,
    userId = userId,
    title = title,
    body = body
)

fun Post.toPostEntity(): PostEntity = PostEntity(
    id = id,
    userId = userId,
    title = title,
    body = body
)