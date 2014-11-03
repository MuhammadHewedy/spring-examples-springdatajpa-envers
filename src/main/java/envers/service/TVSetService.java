package envers.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import envers.domain.TVSet;
import envers.repository.TVSetRepository;

@Service("tvSetService")
public class TVSetService {

	@Inject
	TVSetRepository tvSetRepository;

	public void addTVSet() {
		TVSet tvSet = new TVSet();
		tvSet.setManufacturer("Toshiba");
		tvSet.setUdid(System.currentTimeMillis());
		tvSetRepository.save(tvSet);
	}

	public void updateTVSet(long id) {
		TVSet tvSet = tvSetRepository.findOne(id);
		tvSet.setUdid(System.currentTimeMillis());
		tvSetRepository.save(tvSet);
	}
}
