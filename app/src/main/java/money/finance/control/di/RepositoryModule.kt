package money.finance.control.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import money.finance.control.data.AccountOperationRepository
import money.finance.control.data.AccountOperationRepositoryImpl
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideMovieRepository(): AccountOperationRepository = AccountOperationRepositoryImpl()

}
