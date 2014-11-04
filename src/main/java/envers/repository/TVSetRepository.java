package envers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.history.RevisionRepository;
import org.springframework.stereotype.Repository;

import envers.domain.TVSet;

@Repository
public interface TVSetRepository extends
		RevisionRepository<TVSet, Long, Integer>, CrudRepository<TVSet, Long> {

}
