package nl.ah.barcodeanalyzer.handlers

import nl.ah.barcodeanalyzer.model.BarcodeData
import nl.ah.barcodeanalyzer.model.BarcodeType
import nl.ah.barcodeanalyzer.model.Intent

interface BarcodeHandler {

    /**
     * Checks if the implementation can handle a certain barcodeType (Strategy)
     */
    fun canHandle(type: BarcodeType): Boolean

    /**
     * Handle this Startegy and do specific parsing (or other stuff)
     */
    fun handle(intent: Intent): BarcodeData

}