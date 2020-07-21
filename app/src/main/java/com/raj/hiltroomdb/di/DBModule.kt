package com.example.hiltdemo.di

import android.content.Context
import androidx.room.Room
import com.example.hiltdemo.data.AppDB
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import dagger.hilt.android.qualifiers.ApplicationContext
import java.util.concurrent.Executors

@Module
@InstallIn(ApplicationComponent::class)
object DBModule {

    lateinit var appDB: AppDB

    private val executor = Executors.newSingleThreadExecutor()

    @Provides
    fun provideDatabase(
        @ApplicationContext appContext: Context
    ): AppDB {
        appDB = Room.databaseBuilder(
            appContext,
            AppDB::class.java,
            "user.db"
        ).allowMainThreadQueries()
            .build()
        return appDB
    }

}
