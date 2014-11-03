package envers.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import envers.domain.TVSet;

@Repository
public interface TVSetRepository extends CrudRepository<TVSet, Long>/*
																	 * ,
																	 * RevisionRepository
																	 * <TVSet,
																	 * Long,
																	 * Integer>
																	 */{

}
