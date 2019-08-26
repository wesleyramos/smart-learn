package com.wesley.smartlearn.components.users

import io.mockk.every
import io.mockk.mockk
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.springframework.http.HttpStatus
import java.time.LocalDate

class UserControllerTest {

    private val userRepository: UserRepository = mockk()
    private val controller: UserController = UserController(userRepository)

    @Test
    fun testCreate() {

        val userToCreate = User(null, "João", "da Silva", LocalDate.parse("1990-01-30"))
        val expectedResult = User(1L, "João", "da Silva", LocalDate.parse("1990-01-30"))

        every { userRepository.create(userToCreate) } returns expectedResult

        val result = controller.create(userToCreate)

        assertThat(result.statusCode).isEqualTo(HttpStatus.CREATED)
        assertThat(result.body).isEqualTo(expectedResult)

    }

}
