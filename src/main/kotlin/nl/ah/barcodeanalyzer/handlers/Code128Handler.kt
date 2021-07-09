package nl.ah.barcodeanalyzer.handlers

import nl.ah.barcodeanalyzer.model.BarcodeData
import nl.ah.barcodeanalyzer.model.BarcodeType
import nl.ah.barcodeanalyzer.model.Intent
import org.springframework.stereotype.Component

@Component
class Code128Handler: BarcodeHandler {

    companion object {
        val barcodeType: BarcodeType = BarcodeType.CODE128
    }

    override fun canHandle(type: BarcodeType): Boolean {
        return barcodeType == type
    }

    override fun handle(intent: Intent): BarcodeData {
        val parsedData = mutableMapOf<String, Any>()
        // Do parsing logic specific for Code128
        parsedData.put("duplicated", intent.data + intent.data)
        return BarcodeData(intent.type, intent.data, parsedData)
    }
}