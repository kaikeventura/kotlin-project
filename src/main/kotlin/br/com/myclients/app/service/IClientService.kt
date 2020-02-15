package br.com.myclients.app.service

import br.com.myclients.app.dto.ClientDto
import ch.qos.logback.core.net.server.Client

interface IClientService{
    fun saveClient(clientDto: ClientDto)
}
