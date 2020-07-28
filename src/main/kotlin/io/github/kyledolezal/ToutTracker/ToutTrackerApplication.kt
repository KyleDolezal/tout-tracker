package io.github.kyledolezal.ToutTracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ToutTrackerApplication

fun main(args: Array<String>) {
	runApplication<ToutTrackerApplication>(*args)
}
