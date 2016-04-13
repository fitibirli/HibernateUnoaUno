package test;

import dao.ClienteDao;
import dao.ContactoDao;
import datos.Cliente;

public class TestEliminarClienteYContacto {
	
	
	
	public static void main(String[] args) {
		ContactoDao dao = new ContactoDao();
		ClienteDao daoCliente = new ClienteDao();

		long idCliente = 1;
		
		Cliente c = daoCliente.traerClienteYContacto(idCliente);
		
		dao.eliminar(c.getContacto());
	}
	

}
