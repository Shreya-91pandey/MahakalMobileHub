package com.mahakal.mobilehub.utils

object ShippingLogic {
    fun isIndorePincode(pincode: String): Boolean {
        return pincode.startsWith("4520") || pincode.startsWith("4521")
    }
    data class ShippingOption(
        val isCodAvailable: Boolean,
        val deliveryMessage: String
    )
    fun getShippingOption(pincode: String): ShippingOption {
        return if (isIndorePincode(pincode)) {
            ShippingOption(true, "2-Hour Fast Delivery in Indore! COD Available")
        } else {
            ShippingOption(false, "All India - Prepaid Only")
        }
    }
}
