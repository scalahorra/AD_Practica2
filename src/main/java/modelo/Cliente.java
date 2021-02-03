package modelo;

import javax.persistence.*;

@Entity
@Table(name="cliente")
public class Cliente {

	@Id
	@Column(name="codigo_cliente")
	private int codigoCliente;
	@Column(name="nombre_cliente")
	private String nombreCliente;
	@Column(name="nombre_contacto")
	private String nombreContacto;
	@Column(name="apellido_contacto")
	private String apellidoContacto;
	@Column(name="telefono")
	private int telefono;
	@Column(name="fax")
	private int fax;
	@Column(name="linea_direccion1")
	private String lineaDireccion1;
	@Column(name="linea_direccion2")
	private String lineaDireccion2;
	@Column(name="ciudad")
	private String ciudad;
	@Column(name="region")
	private String region;
	@Column(name="pais")
	private String pais;
	@Column(name="codigo_postal")
	private int codigoPostal;
	@Column(name="codigo_empleado_rep_ventas")
	private int codigoEmpleadoRepVentas;
	@Column(name="limite_credito")
	private float limiteCredito;
	
	
	public Cliente() {
		
	}
	
	public Cliente(int codigoCliente, String nombreCliente,
			int telefono, int fax, String lineaDireccion1, String ciudad) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombreCliente = nombreCliente;
		this.telefono = telefono;
		this.fax = fax;
		this.lineaDireccion1 = lineaDireccion1;
		this.ciudad = ciudad;
	}


	public int getCodigoCliente() {
		return codigoCliente;
	}
	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getNombreContacto() {
		return nombreContacto;
	}
	public void setNombreContacto(String nombreContacto) {
		this.nombreContacto = nombreContacto;
	}
	public String getApellidoContacto() {
		return apellidoContacto;
	}
	public void setApellidoContacto(String apellidoContacto) {
		this.apellidoContacto = apellidoContacto;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	public int getFax() {
		return fax;
	}
	public void setFax(int fax) {
		this.fax = fax;
	}
	public String getLineaDireccion1() {
		return lineaDireccion1;
	}
	public void setLineaDireccion1(String lineaDireccion1) {
		this.lineaDireccion1 = lineaDireccion1;
	}
	public String getLineaDireccion2() {
		return lineaDireccion2;
	}
	public void setLineaDireccion2(String lineaDireccion2) {
		this.lineaDireccion2 = lineaDireccion2;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public int getCodigoEmpleadoRepVentas() {
		return codigoEmpleadoRepVentas;
	}
	public void setCodigoEmpleadoRepVentas(int codigoEmpleadoRepVentas) {
		this.codigoEmpleadoRepVentas = codigoEmpleadoRepVentas;
	}
	public float getLimiteCredito() {
		return limiteCredito;
	}
	public void setLimiteCredito(float limiteCredito) {
		this.limiteCredito = limiteCredito;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nombreCliente=" + nombreCliente + ", nombreContacto="
				+ nombreContacto + ", apellidoContacto=" + apellidoContacto + ", telefono=" + telefono + ", fax=" + fax
				+ ", lineaDireccion1=" + lineaDireccion1 + ", lineaDireccion2=" + lineaDireccion2 + ", ciudad=" + ciudad
				+ ", region=" + region + ", pais=" + pais + ", codigoPostal=" + codigoPostal
				+ ", codigoEmpleadoRepVentas=" + codigoEmpleadoRepVentas + ", limiteCredito=" + limiteCredito + "]";
	}	
}
