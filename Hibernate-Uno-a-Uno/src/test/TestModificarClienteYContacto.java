package test;

import dao.ClienteDao;
import dao.ContactoDao;
import datos.Cliente;
import datos.Contacto;

public class TestModificarClienteYContacto {
	
	
	
	
	public static void main(String[] args) {
		
		ContactoDao dao = new ContactoDao();
		
		ClienteDao daoCliente = new ClienteDao();

		long idCliente = 1;
		
		Cliente c = daoCliente.traerClienteYContacto(idCliente);
		
		Contacto contacto = c.getContacto();
		
		contacto.setEmail("asdasd");
		
		contacto.setFijo("123");
		
		contacto.setMovil("456");
		
		contacto.setCliente(c);
		
		daoCliente.actualizar(c);
		dao.actualizar(c.getContacto());
	}
	
	

}
