package nl.ah.barcodeanalyzer.service

import nl.ah.barcodeanalyzer.handlers.BarcodeHandler
import nl.ah.barcodeanalyzer.model.BarcodeType
import org.springframework.stereotype.Component

@Component
class BarcodeDelegator(val handlers: List<BarcodeHandler>) {

    /**
     * Get a handler based on the Strategy (barcodeType)
     */
    fun getHandler(type: BarcodeType): BarcodeHandler {
        for(h in handlers){
            if(h.canHandle(type)){
                return h
            }
        }
        throw Exception("Can not handle $type")
    }
}