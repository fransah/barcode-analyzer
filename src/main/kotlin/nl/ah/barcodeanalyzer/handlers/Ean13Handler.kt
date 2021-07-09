package nl.ah.barcodeanalyzer.handlers

import nl.ah.barcodeanalyzer.model.BarcodeData
import nl.ah.barcodeanalyzer.model.BarcodeType
import nl.ah.barcodeanalyzer.model.Intent
import org.springframework.stereotype.Component

@Component
class Ean13Handler: BarcodeHandler {

    override fun canHandle(type: BarcodeType): Boolean = BarcodeType.EAN13 == type

    override fun handle(intent: Intent): BarcodeData {
        val parsedData = mutableMapOf<String, Any>()
        // Do parsing logic specific for Ean13
        parsedData.put("UPPERCASED", intent.data.uppercase())
        return BarcodeData(intent.type, intent.data, parsedData)
    }
}