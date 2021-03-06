package org.camunda.bpm.getstarted.loanapproval.Repository;

import java.util.List;

import org.camunda.bpm.getstarted.loanapproval.Model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientsRepository extends JpaRepository<Clients, Long>{

	List<Clients> findByProfile(String profile);

	@Query("SELECT u FROM Clients u WHERE u.client_name = ?1")
	Clients findClientsByClientName(String client_name);

}
