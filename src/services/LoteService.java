package services;

import models.Lote;
import repositories.LoteRepository;

public class LoteService {

	private LoteRepository loteRep;
	
	public LoteService(LoteRepository rep) {
		this.loteRep = rep;
	}
	
	public String addLote(Lote lote) {
		this.loteRep.addLote(lote);
		return lote.getId();
	}
}
