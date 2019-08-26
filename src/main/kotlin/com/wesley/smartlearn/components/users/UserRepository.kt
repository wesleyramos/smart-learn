package com.wesley.smartlearn.components.users

interface UserRepository {

    fun create(user: User): User

    fun get(idUser: Long): User

}
