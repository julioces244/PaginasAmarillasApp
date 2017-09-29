package com.apaza.paginasamarillasapp;

/**
 * Created by Aldair on 20/09/2017.
 */

import java.util.ArrayList;
import java.util.List;

public class EmpresaRepository {

    private static EmpresaRepository _INSTANCE = null;

    private EmpresaRepository(){}

    public static EmpresaRepository getInstance(){
        if(_INSTANCE == null)
            _INSTANCE = new EmpresaRepository();
        return _INSTANCE;
    }

    private List<Empresa> empresas = new ArrayList<>();

    public List<Empresa> getEmpresas() {
        return this.empresas;
    }

    public void agregarEmpresa(Empresa empresa){
        this.empresas.add(empresa);
    }

}
