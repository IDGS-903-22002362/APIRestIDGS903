package com.lrosas.apirestidgs903

data class StudentState(
    val students: List<Student> = emptyList(),
    val isLoading: Boolean = false,
    val error: String? = null
)
