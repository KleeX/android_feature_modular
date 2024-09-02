package com.test.app.feature_posts.di

import com.test.app.feature_posts.data.local.PostsLocalDataSource
import com.test.app.feature_posts.data.local.PostsLocalDataSourceImpl
import com.test.app.feature_posts.data.remote.PostsRemoteDataSource
import com.test.app.feature_posts.data.remote.PostsRemoteDataSourceImpl
import com.test.app.feature_posts.repository.PostRepoImpl
import com.test.app.feature_posts.repository.PostsRepository
import com.test.app.feature_posts.usecases.GetDataUseCase
import com.test.app.feature_posts.usecases.GetDataUseCaseImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
internal abstract class PostUseCaseModule {

    @Binds
    abstract fun bindGetDataUseCase(getDataUseCaseImpl: GetDataUseCaseImpl): GetDataUseCase

    @Binds
    abstract fun bindPostsRepository(impl: PostRepoImpl): PostsRepository

    @Binds
    abstract fun bindPostLocalDataSource(impl: PostsLocalDataSourceImpl): PostsLocalDataSource

    @Binds
    abstract fun bindPostRemoteDataSource(impl: PostsRemoteDataSourceImpl): PostsRemoteDataSource
}
