package nl.ah.barcodeanalyzer.model

data class BarcodeData(val type: BarcodeType, val data:String, val parsedData: Map<String, Any>) {
}