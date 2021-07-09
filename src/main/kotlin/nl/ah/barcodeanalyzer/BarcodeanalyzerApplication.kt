package nl.ah.barcodeanalyzer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BarcodeanalyzerApplication

fun main(args: Array<String>) {
	runApplication<BarcodeanalyzerApplication>(*args)
}
