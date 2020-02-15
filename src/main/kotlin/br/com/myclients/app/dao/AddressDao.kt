package br.com.myclients.app.dao

import br.com.myclients.app.model.Address
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface AddressDao : JpaRepository<Address, Long>