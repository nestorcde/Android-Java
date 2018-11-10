package py.com.prestosoftware.facepet.repository;

import java.util.List;

import py.com.prestosoftware.facepet.model.Ciudad;

public interface CiudadInterface {
	
	List<Ciudad> getCiudades();
	
	boolean save(Ciudad ciudad);

}
