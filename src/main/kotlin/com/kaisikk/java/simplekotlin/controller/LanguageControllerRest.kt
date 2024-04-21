package com.kaisikk.java.simplekotlin.controller

import com.kaisikk.java.simplekotlin.domain.Language
import com.kaisikk.java.simplekotlin.repo.LanguageRepo
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class LanguageControllerRest(val repo: LanguageRepo) {


    @GetMapping
    fun index() = repo.findAll()

    @GetMapping("/{name}")
    fun findByNameAndAuthor(@RequestParam(required = false, name = "author") author: String,
                            @PathVariable name:String): List<Language>{

        val res = if(author == null)repo.findByName(name)
        else repo.findByNameAndAuthor(name, author)

        return res;
    }

}