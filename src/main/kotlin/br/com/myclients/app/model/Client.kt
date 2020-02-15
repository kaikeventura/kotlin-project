package br.com.myclients.app.model

import com.fasterxml.jackson.annotation.JsonBackReference
import com.fasterxml.jackson.annotation.JsonProperty
import org.hibernate.annotations.Fetch
import javax.persistence.*

@Entity
data class Client(

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        @JsonProperty("name")
        val name: String,

        @Column(nullable = false, unique = true)
        @JsonProperty("document_number")
        val documentNumber: String,

        @JsonBackReference
        @OneToMany(mappedBy = "address", cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
        var address: List<Address> = emptyList()
)