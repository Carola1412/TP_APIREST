package com.example.inicial1.services;
import java.util.List;
public interface BaseService<E> {
    public List<E> findAll() throws Exception; //me trae una lista de todas las personas de la base
    public E findById(Long id) throws Exception; //me trae una entidad de acuerdo al id
    public E save(E entity) throws Exception;  //crea una nueva entidad
    public E uptdate(Long id, E entity) throws Exception;
    public boolean delete(Long id) throws Exception;
}
