package br.com.myclients.app.dto

import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.Column

data class AddressDto(
        @JsonProperty("address")
        val address: String,
        @JsonProperty("number")
        val number: String,
        @JsonProperty("city")
        val city: String,
        @JsonProperty("state")
        val state: String,
        @JsonProperty("postal_code")
        val postalCode: Int
)