package Banco;

import java.util.Calendar;

	public abstract class CuentaAbs {
		
		private String numero;
		private String titular;
		private double saldo;
		private Calendar fechaApertura;
		
		public CuentaAbs(String numero, String titular, double saldo) {
			this.numero = numero;
			this.titular = titular;
			this.saldo = saldo;
			this.fechaApertura = Calendar.getInstance();
		}
	
		public String getNumero() {
			return numero;
		}
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		public Calendar getFechaApertura() {
			return fechaApertura;
		}
		public void setFechaApertura(Calendar fechaApertura) {
			this.fechaApertura = fechaApertura;
		}
		public void ingresar(double cantidad) {
			this.saldo += cantidad;
		}
		public void retirar(double cantidad) {
			this.saldo -= cantidad;
		}
		public String toString() {
			return "Cuenta: " + this.numero + " - " + this.titular + " - " + this.saldo;
		}
		public abstract double calculaInteres(double cantidad);
}