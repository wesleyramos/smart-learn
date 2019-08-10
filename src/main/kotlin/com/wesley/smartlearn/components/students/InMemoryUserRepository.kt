package com.wesley.smartlearn.components.students

import org.springframework.stereotype.Component

@Component
class InMemoryUserRepository(var idUser: Long = 1L, var listUser: HashMap<Long, User> = HashMap()) : UserRepository {

    override fun create(user: User): User {
        user.id = idUser
        idUser++
        listUser[user.id!!] = user

        return user
    }

}