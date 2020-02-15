package br.com.myclients.app.dao

import br.com.myclients.app.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientDao : JpaRepository<Client, Long>