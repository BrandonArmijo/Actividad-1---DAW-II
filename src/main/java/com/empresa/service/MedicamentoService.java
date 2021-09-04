package com.empresa.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.empresa.entity.Medicamento;

@Service
public interface MedicamentoService {

	public abstract List<Medicamento> listaMedicamento();
	public abstract Medicamento registraMedicamento(Medicamento med);
}
