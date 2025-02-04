package org.example.springsecurityhandmade.service;

import java.util.Optional;

public interface IGeneralService<T> {
    Iterable<T> findAll();

    Optional findById(Long id);

    T save(T t);

    void delete(Long id);
}
