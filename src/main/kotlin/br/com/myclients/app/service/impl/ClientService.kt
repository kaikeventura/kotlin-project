package br.com.myclients.app.service.impl

import br.com.myclients.app.dao.AddressDao
import br.com.myclients.app.dao.ClientDao
import br.com.myclients.app.dto.ClientDto
import br.com.myclients.app.service.IClientService
import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.kotlin.KotlinModule
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ClientService(
        @Autowired private val clientDao: ClientDao,
        @Autowired private val addressDao: AddressDao
    ) : IClientService {

    override fun saveClient(clientDto: ClientDto) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun <T> fromToInObjects(fromObject: T, toObject: T){
        val mapper = ObjectMapper().registerModule(KotlinModule())
        try {
            val json = mapper.writeValueAsString(fromObject)
            toObject = mapper.readValue(json, toObject::class)
        }
        catch ()
    }
}