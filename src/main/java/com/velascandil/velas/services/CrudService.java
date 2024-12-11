package com.velascandil.velas.services;

import java.util.Collection;

//This interface uses generics in order to make it easier to use it in others interfaces or services.
//C is equal to the created element, T is object which will be the main or principal and U is the element update
public interface CrudService <C, T, U>{

    T create (C c);

    T findById (Integer id);

    Collection<T> findAll ();

    T updateById (Integer id, U u);

    void deleteById (Integer id);
}
