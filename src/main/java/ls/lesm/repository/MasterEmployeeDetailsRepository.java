package ls.lesm.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ls.lesm.model.MasterEmployeeDetails;
@Repository
public interface MasterEmployeeDetailsRepository extends JpaRepository<MasterEmployeeDetails, Integer> {
	
	@Query("FROM MasterEmployeeDetails g where g.supervisor.id = :supervisor")
	List<MasterEmployeeDetails>  findBymasterEmployeeDetails_Id(@Param("supervisor")Integer  id);
	
	

}
