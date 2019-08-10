package com.wesley.smartlearn.components.students

import java.time.LocalDate

class User(var id: Long? = null, var name: String, var lastName: String, var dateOfBirth: LocalDate) {

    override fun equals(other: Any?): Boolean {
        if (other == null || other !is User)
            return false
        return id == other.id && name == other.name && lastName == other.lastName && dateOfBirth == other.dateOfBirth
    }
}