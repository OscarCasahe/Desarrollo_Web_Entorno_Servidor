package org.iesalixar.servidor.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.iesalixar.servidor.model.Asignatura;
import org.iesalixar.servidor.model.Grado;
import org.iesalixar.servidor.repository.AsignaturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AsignaturaServiceImpl implements AsignaturaService {

	@Autowired
	AsignaturaRepository asignaturaRepo;

	@Override
	public List<Asignatura> getAllAsignaturas() {

		// Obtengo el resultado a través del repositorio
		List<Asignatura> asignBD = asignaturaRepo.findAll();

		// Verificando que he obtenido algo
		if (asignBD != null && asignBD.size() > 0) {

			return asignBD;
		}

		// No he obtenido nada devuelvo una lista vacía (para no devolver nulo)
		return new ArrayList<Asignatura>();
	}

	@Override
	public Optional<Asignatura> findAsignaturaById(Long id) {
		
		Optional<Asignatura> asignatura = null;
		
		if (id!=null) {
			asignatura = asignaturaRepo.findById(id);
		}
		
		return asignatura;
		
	}
	
	@Override
	public Grado getAsignaturaByName(String nombre) {
		
		if (nombre!=null) {
		
			Grado grado =asignaturaRepo.findByNombre(nombre);
			
			return grado; 			
		}
		
		return null;
	}
	
	@Override
	public Grado insertarAsignatura(Asignatura asignatura) {
		
		if (asignatura!=null && getAsignaturaByName(asignatura.getNombre())==null) {
			Asignatura asignaturaBD = asignaturaRepo.save(asignatura);
			return asignatura;
		}
		
		return null;
	}

}
