package gg.buildbehemoth.webservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BuildBehemothApplication

fun main(args: Array<String>) {
	runApplication<BuildBehemothApplication>(*args)
}
