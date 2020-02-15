package br.com.myclients.app.dto

import br.com.myclients.app.model.Address
import com.fasterxml.jackson.annotation.JsonProperty

data class ClientDto(
        @JsonProperty("name")
        val name: String,
        @JsonProperty("document_number")
        val documentNumber: String,
        @JsonProperty("address")
        val address: List<AddressDto> = emptyList()
)