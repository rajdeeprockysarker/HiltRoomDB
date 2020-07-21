package com.example.hiltdemo.data

import com.example.hiltdemo.data.entity.User
import javax.inject.Inject

class DataRepository
@Inject
constructor(
    appDB: AppDB
) {

    private val wordDao = appDB.userDao()


    fun insert(word: User) {

        wordDao.insert(word)

    }

    fun getAllWords() = wordDao.getAllWords()

}