package com.kaisikk.java.simplekotlin

import com.kaisikk.java.simplekotlin.domain.Language
import com.kaisikk.java.simplekotlin.repo.LanguageRepo
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class SimplekotlinApplication

fun main(args: Array<String>) {
    runApplication<SimplekotlinApplication>(*args)


    @Bean
    fun preload(repo: LanguageRepo) = CommandLineRunner { args ->
        repo.save(Language("scala", "odersky"))
        repo.save(Language("java", "gosling"))
        repo.save(Language("elixir", "valim"))
        repo.save(Language("clojure", "hitch"))
    }

}
