# Barcode Analyzer
This is a simplified implementation of a barcode analyzer based on the Strategy Pattern. It is not intended to be a full blown application.

BarcodeHandler Interface:
```kotlin
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
```
And an exaple implementation:
```kotlin
class SomeBarcodeHandler: BarcodeHandler {
    
    override fun canHandle(type: BarcodeType): Boolean = BarcodeType.SOME == type

    override fun handle(intent: Intent): BarcodeData {
        val parsedData = mutableMapOf<String, Any>()
        // Do parsing logic specific for a certain Barcode
        parsedData.put("SOME_PROP_1", intent.data.uppercase())
        parsedData.put("SOME_PROP_2", intent.data.uppercase())
        return BarcodeData(intent.type, intent.data, parsedData)
    }
}
```

#### Running the application locally

The following command will bring up the service on localhost with port 8090 with a swagger interface..

    mvn spring-boot:run