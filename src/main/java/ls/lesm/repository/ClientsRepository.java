package ls.lesm.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;



import ls.lesm.model.Clients;
import ls.lesm.model.EmployeesAtClientsDetails;

public interface ClientsRepository extends JpaRepository<Clients, Integer> {

	Clients findByClientsNames(String clientsNames);
	
	
	
	
}
