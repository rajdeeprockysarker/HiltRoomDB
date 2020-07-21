package com.raj.hiltroomdb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hiltdemo.data.AppDB
import com.example.hiltdemo.data.DataRepository
import com.example.hiltdemo.data.entity.User
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var appDB: AppDB

    @Inject
    lateinit var dataRepository: DataRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        appDB.userDao().insert(User(1,"xcxcx",lastName = "123"))
        appDB.userDao().insert(User(2,"xcxcx",lastName = "123"))

        appDB.userDao().getAllWords()


    }
}