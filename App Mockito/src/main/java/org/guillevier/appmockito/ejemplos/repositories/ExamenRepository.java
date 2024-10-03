package org.guillevier.appmockito.ejemplos.repositories;

import org.guillevier.appmockito.ejemplos.models.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();
}
