package co.com.facebook.screenplay.model.user;

import java.util.ArrayList;
import java.util.List;

public class User {
 private String nombre;
 private String apellido;
 private String correo;
 private String telefono;
 private String contra;
 private String diaNacimiento;
 private String mesNacimiento;
 private String anoNacimiento;
 private String genero;
 private List<String> friendList = new ArrayList<>();

 public List<String> getFriendList() {
  return friendList;
 }

 public void setFriendList(List<String> friendList) {
  this.friendList = friendList;
 }

 public String getNombre() {
  return nombre;
 }

 public void setNombre(String nombre) {
  this.nombre = nombre;
 }

 public String getApellido() {
  return apellido;
 }

 public void setApellido(String apellido) {
  this.apellido = apellido;
 }

 public String getCorreo() {
  return correo;
 }

 public void setCorreo(String correo) {
  this.correo = correo;
 }

 public String getTelefono() {
  return telefono;
 }

 public void setTelefono(String telefono) {
  this.telefono = telefono;
 }

 public String getContra() {
  return contra;
 }

 public void setContra(String contra) {
  this.contra = contra;
 }

 public String getDiaNacimiento() {
  return diaNacimiento;
 }

 public void setDiaNacimiento(String diaNacimiento) {
  this.diaNacimiento = diaNacimiento;
 }

 public String getMesNacimiento() {
  return mesNacimiento;
 }

 public void setMesNacimiento(String mesNacimiento) {
  this.mesNacimiento = mesNacimiento;
 }

 public String getAnoNacimiento() {
  return anoNacimiento;
 }

 public void setAnoNacimiento(String anoNacimiento) {
  this.anoNacimiento = anoNacimiento;
 }

 public String getGenero() {
  return genero;
 }

 public void setGenero(String genero) {
  this.genero = genero;
 }
}