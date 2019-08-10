package com.wesley.smartlearn.components.students

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import java.time.LocalDate

class InMemoryUserRepositoryTest {

    @Test
    fun create() {
        val repo = InMemoryUserRepository()
        val createdUser: User = repo.create(User(null, "Alex", "Silva", LocalDate.parse("1990-01-01")))
        val expectedUser = User(1L, "Alex", "Silva", LocalDate.parse("1990-01-01"))

        assertThat(createdUser).isEqualTo(expectedUser)
    }

}