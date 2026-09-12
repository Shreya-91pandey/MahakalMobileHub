package com.mahakal.mobilehub.utils

object ShippingLogic {
    // Indore ke pincode 4520xx se start hote hai
    fun isIndorePincode(pincode: String): Boolean {
        return pincode.startsWith("4520") || pincode.startsWith("4521")
    }

    data class ShippingOption(
        val isCodAvailable: Boolean,
        val isDeliveryAvailable: Boolean,
        val deliveryMessage: String,
        val deliveryCharge: Int
    )

    fun getShippingOption(pincode: String): ShippingOption {
        return if (isIndorePincode(pincode)) {
            // Indore ka rule
            ShippingOption(
                isCodAvailable = true,
                isDeliveryAvailable = true,
                deliveryMessage = "2-Hour Fast Delivery in Indore! COD Available",
                deliveryCharge = 0
            )
        } else {
            // All India ka rule - COD strictly band
            ShippingOption(
                isCodAvailable = false,
                isDeliveryAvailable = true,
                deliveryMessage = "All India Delivery - Prepaid Only (COD Not Available)",
                deliveryCharge = 49
            )
        }
    }
}
