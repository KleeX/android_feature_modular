package com.test.app.feature_post_details.di

import com.test.app.feature_post_details.data.PostLocalDataSource
import com.test.app.feature_post_details.data.PostLocalDataSourceImpl
import com.test.app.feature_post_details.repository.PostDetailsRepository
import com.test.app.feature_post_details.repository.PostDetailsRepositoryImpl
import com.test.app.feature_post_details.usecases.GetPostDetails
import com.test.app.feature_post_details.usecases.GetPostDetailsImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
internal abstract class PostUseCaseModule {

    @Binds
    abstract fun bindGetPostDetails(getPostDetails: GetPostDetailsImpl): GetPostDetails

    @Binds
    abstract fun bindPostDetailsRepository(impl: PostDetailsRepositoryImpl): PostDetailsRepository

    @Binds
    abstract fun bindPostLocalDataSource(impl: PostLocalDataSourceImpl): PostLocalDataSource
}
