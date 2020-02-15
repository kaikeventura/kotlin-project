package br.com.myclients.app.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonProperty
import javax.persistence.*

@Entity
data class Address(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        @JsonProperty("address")
        val address: String,

        @Column(nullable = false)
        @JsonProperty("number")
        val number: String,

        @Column(nullable = false)
        @JsonProperty("city")
        val city: String,

        @Column(nullable = false)
        @JsonProperty("state")
        val state: String,

        @Column(nullable = false)
        @JsonProperty("postal_code")
        val postalCode: Int,

        @JsonBackReference
        @ManyToOne(fetch = FetchType.EAGER)
        @JoinColumn(name = "id_client")
        val client: Client? = null
)