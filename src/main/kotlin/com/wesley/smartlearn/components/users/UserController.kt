package com.wesley.smartlearn.components.users

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/user")
class UserController(private val userRepository: UserRepository) {

    @PostMapping
    fun create(@RequestBody userToCreate: User): ResponseEntity<User> {
        return ResponseEntity(this.userRepository.create(userToCreate), HttpStatus.CREATED)
    }

}
