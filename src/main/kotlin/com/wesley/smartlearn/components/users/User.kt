package com.wesley.smartlearn.components.users

import java.time.LocalDate

data class User(var id: Long? = null, val name: String, val lastName: String, val dateOfBirth: LocalDate)
