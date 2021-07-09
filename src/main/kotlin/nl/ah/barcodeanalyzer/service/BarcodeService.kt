package nl.ah.barcodeanalyzer.service

import nl.ah.barcodeanalyzer.model.BarcodeData
import nl.ah.barcodeanalyzer.model.Intent
import org.springframework.stereotype.Service

@Service
class BarcodeService(val delegater: BarcodeDelegator) {

    fun handleIntent(intent: Intent): BarcodeData{
        val barcodeHandler = delegater.getHandler(intent.type)
        return barcodeHandler.handle(intent)
    }
}