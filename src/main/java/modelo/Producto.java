package modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {

	@Id
	@Column(name="codigo_producto")
	private int codigoProducto;
	@Column(name="nombre")
	private String nombre;
	@Column(name="gama")
	private String gama;
	@Column(name="dimensiones")
	private String dimensiones;
	@Column(name="proveedor")
	private String proveedor;
	@Column(name="descripcion")
	private String descripcion;
	@Column(name="cantidad_en_stock")
	private int cantidadStock;
	@Column(name="precio_venta")
	private float precioVenta;
	@Column(name="precio_proveedor")
	private float precioProveedor;
	
	
	public Producto() {
		
	}
	
	public Producto(int codigoProducto, String nombre, String gama, int cantidadStock, float precioVenta) {
		super();
		this.codigoProducto = codigoProducto;
		this.nombre = nombre;
		this.gama = gama;
		this.cantidadStock = cantidadStock;
		this.precioVenta = precioVenta;
	}
	
	
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGama() {
		return gama;
	}
	public void setGama(String gama) {
		this.gama = gama;
	}
	public String getDimensiones() {
		return dimensiones;
	}
	public void setDimensiones(String dimensiones) {
		this.dimensiones = dimensiones;
	}
	public String getProveedor() {
		return proveedor;
	}
	public void setProveedor(String proveedor) {
		this.proveedor = proveedor;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCantidadStock() {
		return cantidadStock;
	}
	public void setCantidadStock(int cantidadStock) {
		this.cantidadStock = cantidadStock;
	}
	public float getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	public float getPrecioProveedor() {
		return precioProveedor;
	}
	public void setPrecioProveedor(float precioProveedor) {
		this.precioProveedor = precioProveedor;
	}
	
	
	@Override
	public String toString() {
		return "Producto [codigoProducto=" + codigoProducto + ", nombre=" + nombre + ", gama=" + gama + ", dimensiones="
				+ dimensiones + ", proveedor=" + proveedor + ", descripcion=" + descripcion + ", cantidadStock="
				+ cantidadStock + ", precioVenta=" + precioVenta + ", precioProveedor=" + precioProveedor + "]";
	}	
}
