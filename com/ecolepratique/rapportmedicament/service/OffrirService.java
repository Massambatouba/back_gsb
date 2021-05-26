package com.ecolepratique.rapportmedicament.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecolepratique.rapportmedicament.entite.Offrir;
import com.ecolepratique.rapportmedicament.repository.OffrirRepositoryItf;

@Service
public class OffrirService implements OffrirServiceItf {

		@Autowired
		private OffrirRepositoryItf offrirDao;
		@Override
		public List<Offrir> list() {
			return offrirDao.findAll();
		}
		
		@Override
		public Offrir create(Offrir offrir)
		{
			return offrirDao.save(offrir);
		}
		@Override
		public Offrir getById(Long id)
		{
			return offrirDao.findById(id).get();
		}
		@Override
		public Offrir deleteById(Long id) 
		{
			Offrir offrir = getById(id);
			offrirDao.deleteById(id);
			return offrir;
		} 
		@Override
		public Offrir updateById(Long id, Offrir offrir) 
		{
			offrir.setId(id);
			return offrirDao.save(offrir);
		}
	}