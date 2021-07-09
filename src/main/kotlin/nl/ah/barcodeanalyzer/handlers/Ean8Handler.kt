package nl.ah.barcodeanalyzer.handlers

import nl.ah.barcodeanalyzer.model.BarcodeData
import nl.ah.barcodeanalyzer.model.BarcodeType
import nl.ah.barcodeanalyzer.model.Intent
import org.springframework.stereotype.Component

@Component
class Ean8Handler: BarcodeHandler {

    companion object {
        val barcodeType: BarcodeType = BarcodeType.EAN8
    }

    override fun canHandle(type: BarcodeType): Boolean {
        return barcodeType == type
    }

    override fun handle(intent: Intent): BarcodeData {
        val parsedData = mutableMapOf<String, Any>()
        // Do parsing logic specific for Ean8
        parsedData.put("firstLetter", intent.data.get(0))
        return BarcodeData(intent.type, intent.data, parsedData)
    }
}