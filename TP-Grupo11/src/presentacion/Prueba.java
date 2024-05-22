package presentacion;

import java.util.GregorianCalendar;

import Excepciones.ChoferExistenteException;
import Excepciones.UsuarioExistenteException;
import Excepciones.VehiculoExistenteException;
import modelo.Administrador;
import modelo.Cliente;
import modelo.Pedido;
import negocio.Sistema;


public class Prueba{
    public static void main (String argv[]){
    	
    	Sistema sistema = new Sistema();
    	
    	/**
    	 * En el TP dice que hay un administrador y varios clientes ¿Deberia usar singleton para el administrador tambien?
    	 */
    	Administrador admin = new Administrador(sistema,"Admin", "1234", "Admin Admin");
    	
    	//agregar de usuarios repetidos
    	try {
    		sistema.agregarCliente("Usuario1", "Contra", "Usuario uno");
    		sistema.agregarCliente("Usuario1", "Contra", "Usuario uno");
    	}
    	catch(UsuarioExistenteException e) {
    		System.out.println(e.getMessage());
    	}
    	catch(IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	//agregar chofer existente
    	try {
    		sistema.agregarChofer("123", "Chofer1", "Permanente");
    		sistema.agregarChofer("123", "Chofer1", "Permanente");
    	}
    	catch(ChoferExistenteException e) {
    		System.out.println(e.getMessage());
    	}
    	catch(IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	//agregar Vehiculo existente
    	try {
    		sistema.agregarVehiculo("Auto", "123", true, true,4);
    		sistema.agregarVehiculo("Auto", "123", true, true,4);
    	}
    	catch(VehiculoExistenteException e) {
    		System.out.println(e.getMessage());
    	}
    	catch(IllegalArgumentException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	//consultar por cliente inexistente
    	try {
    		sistema.consultarUsuario("Usuario100"); // nombre usuario cliente
    	}
    	catch(UsuarioExistenteException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	//consultar por chofer inexistente
    	try {
    		sistema.consultarChofer("10");
    	}
    	catch(ChoferExistenteException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	//consultar por vehiculo inexistente
    	try {
    		sistema.consultarVehiculo("125125"); // patente vehiculo
    	}
    	catch(VehiculoExistenteException e) {
    		System.out.println(e.getMessage());
    	}
    	
    	try {
    		sistema.agregarChofer("1", "Chofer1", "Contratado");
    		sistema.agregarChofer("2", "Chofer2", "Temporario");
    		sistema.agregarChofer("3", "Chofer3", "Permanente");
    		sistema.agregarChofer("4", "Chofer4", "Temporario");
    		sistema.agregarChofer("5", "Chofer5", "Permanente");
    		sistema.agregarChofer("6", "Chofer6", "Contratado");
    		sistema.agregarChofer("7", "Chofer7", "Contratado");
    		sistema.agregarChofer("8", "Chofer8", "Temporario");
    		sistema.agregarChofer("9", "Chofer9", "Contratado");
    	}
    	catch(Exception e) {
    		System.out.println(e.getMessage());
    	}
    	
    	
    	
    	
    	
    	
//    	
//    	admin.agregarChofer("1", "chofer1", "Permanente");
//    	admin.agregarChofer("2", "chofer2", "Temporario");
//    	admin.agregarChofer("3", "chofer3", "Contratado");
//    	admin.agregarChofer("4", "Chofer4", "permanente");
//    	admin.agregarChofer("2", "chofer2", "Temporario");//Prueba de cliente existente
//
//    	//System.out.println(admin.getListaChoferes());//Listado de choferes en el sistema
//    	
//    	admin.agregarVehiculo("automovil","asd 123",true,true);
//    	admin.agregarVehiculo("moto","qwe 456",false,false);
//    	admin.agregarVehiculo("combi","zxc 789",true,true);
//    	admin.agregarVehiculo("moto","qwe 456",false,false);// Prueba de vehiculo existente
//    	
////    	System.out.println(admin.getListaVehiculos());
//    	
//    	//Modificacion de vehiculo
//    	System.out.println(admin.consultarVehiculo("asd 123"));
//    	admin.consultarVehiculo("asd 123").setCantPasajeros(3);
//    	System.out.println(admin.consultarVehiculo("asd 123"));
//    	
//    	//Modificacion de chofer
//    	System.out.println(admin.consultarChofer("1"));
//    	System.out.println(admin.consultarChofer("1"));
//    	
//    	//Dinero total a pagar por la empresa
//    	System.out.println(admin.totalDineroNecesario());
//    	
//    	//Calculo de salario Chofer Determinado
//    	System.out.println(admin.calcularSalario("2"));
//    	System.out.println(admin.consultarChofer("10"));// Tira null
//    	
//    	// try catch en la clase admin o en clase prueba?? preg por haber prints en admin.
    	
    	//System.out.println(admin.getListaUsuarios());
    	
//    	sistema.validarPedido(new Pedido(2,"PELIgrosa",true,false));
//    	sistema.validarPedido(new Pedido(1,"SinAsfaltar",false,true));
//    	sistema.validarPedido(new Pedido(6,"ESTANDAR",false,false));
//    	sistema.validarPedido(new Pedido(1,"peligrosa",true,true));
//    	sistema.validarPedido(new Pedido(6,"peligrosa",false,false));
//    	sistema.validarPedido(new Pedido(6,"sinasfaltar",true,true));
    	
//    	Cliente cliente1 = new Cliente("Usuario1","Contra","Usuario1");
//    	Cliente cliente2 = new Cliente("Usuario2","Contra","Usuario2");
//    	Cliente cliente3 = new Cliente("Usuario3","Contra","Usuario3");
//    	Cliente cliente4 = new Cliente("Usuario4","Contra","Usuario4");
//    	
//    	cliente1.hacerPedido("peligrosa", false, true, 2,10);
//    	cliente2.hacerPedido("estandar", false, true, 2,10);
//    	cliente3.hacerPedido("sinasfaltar", true, true, 1,20);
//    	cliente4.hacerPedido("peligrosa", false, true, 6,70);
//    	
//    	System.out.println(admin.getListaViajes());
//    	
//    	
//    	System.out.println(admin.getListaChoferes());
//    	
//    	
//    	try {
//    	sistema.agregarCliente("Cliente1", "12345678", "Cliente uno");
//    	sistema.agregarCliente("Usuario2", "COntrasena2", "Cliente doss");
//    	}
//    	catch(Exception e) {
//    		System.out.println(e.getMessage());
//    	}
//    	
//    	System.out.println(admin.getListaUsuarios());
//    	
//    	System.out.println("dinero total "+admin.totalDineroNecesario());
    	
    }
}

