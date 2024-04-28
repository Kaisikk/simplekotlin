package com.kaisikk.java.simplekotlin

import com.kaisikk.java.simplekotlin.domain.Language
import com.kaisikk.java.simplekotlin.repo.LanguageRepo
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableAsync

@SpringBootApplication
@EnableAsync
class SimplekotlinApplication

fun main(args: Array<String>) {
    runApplication<SimplekotlinApplication>(*args)


    /**
     * Предзагрузка данных в базу при деплое приложения
     */
    @Bean
    fun preload(repo: LanguageRepo) = CommandLineRunner {
        repo.save(Language("scala", "odersky"))
        repo.save(Language("java", "gosling"))
        repo.save(Language("elixir", "valim"))
        repo.save(Language("clojure", "hitch"))
    }

}
