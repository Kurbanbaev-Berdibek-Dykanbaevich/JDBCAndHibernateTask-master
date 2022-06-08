package peaksoft.service;

import peaksoft.Model;

import java.util.List;

public interface Service {
    void create(Model model);

    Model getById(Long id);
    List<Model> read();


    void deleteById(Long id);
    void deleteAll();

}
