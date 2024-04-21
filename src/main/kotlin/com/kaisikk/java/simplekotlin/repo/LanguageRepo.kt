package com.kaisikk.java.simplekotlin.repo

import com.kaisikk.java.simplekotlin.domain.Language
import org.springframework.data.repository.CrudRepository

interface LanguageRepo : CrudRepository<Language, Long> {

    fun findByNameAndAuthor(name: String, author: String): List<Language>

    fun findByName(name: String): List<Language>

}