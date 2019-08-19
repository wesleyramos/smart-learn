package com.wesley.smartlearn.components.students

interface UserRepository {

    fun create(user: User): User

    fun get(idUser: Long): User

}
