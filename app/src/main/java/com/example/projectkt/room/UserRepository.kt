package com.example.projectkt.room

import androidx.lifecycle.LiveData


class UserRepository(private val userDao: UserDao)
{
    val readAllData: LiveData<List<UsersModel>> = userDao.readAll()
  suspend fun addUser(user:UsersModel){

      userDao.addUser(user)

   }



}