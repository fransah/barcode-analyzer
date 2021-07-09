package nl.ah.barcodeanalyzer.controller

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.Parameter
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import nl.ah.barcodeanalyzer.model.BarcodeData
import nl.ah.barcodeanalyzer.model.Intent
import nl.ah.barcodeanalyzer.service.BarcodeService
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class BarcodeController(val service: BarcodeService) {

    @PutMapping("/barcode-intent")
    @Operation(description = "Handle a new barcode Intent.")
    @ApiResponses(
        ApiResponse(responseCode = "200", description = "Intent correctly processed"),
        ApiResponse(responseCode = "400", description = "Not implemented barcode data")
    )
    fun createIntentBarcodeData(
        @RequestBody
        @Parameter(description = "Intent to handle.")
        intent: Intent,
    ): BarcodeData = service.handleIntent(intent)

}