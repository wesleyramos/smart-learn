package com.wesley.smartlearn.components.students

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(private val userRepository: UserRepository) {

    @PostMapping
    fun create(@RequestBody userToCreate: User): ResponseEntity<User> {
        return ResponseEntity(this.userRepository.create(userToCreate), HttpStatus.CREATED)
    }

}
