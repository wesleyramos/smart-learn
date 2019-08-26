package com.wesley.smartlearn.components.users

import org.springframework.stereotype.Component

@Component
class InMemoryUserRepository(var idUser: Long = 0L, var listUser: HashMap<Long, User> = HashMap()) : UserRepository {

    override fun create(user: User): User {
        idUser++

        user.id = idUser
        listUser[user.id!!] = user

        return user
    }

    override fun get(id: Long): User {
        return listUser[id]!!
    }

}
