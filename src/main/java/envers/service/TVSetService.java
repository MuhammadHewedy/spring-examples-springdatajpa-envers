package envers.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.history.Revision;
import org.springframework.data.history.Revisions;
import org.springframework.stereotype.Service;

import envers.domain.TVSet;
import envers.repository.TVSetRepository;

@Service("tvSetService")
public class TVSetService {

	@Inject
	private TVSetRepository tvSetRepository;

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

	public String getHistory(long id) {
		Revisions<Integer, TVSet> revisions = tvSetRepository.findRevisions(id);
		List<Revision<Integer, TVSet>> list = revisions.getContent();

		String rev = "";

		for (Revision<Integer, TVSet> revision : list) {
			rev += "No: " + revision.getRevisionNumber() + ", at: "
					+ revision.getRevisionDate() + ", TVSet UDID: "
					+ revision.getEntity().getUdid() + "<br />";
		}

		return rev;
	}
}
