package br.com.brasilapi.api;

import java.sql.Timestamp;

import br.com.brasilapi.api.CPTEC.Onda;

public interface CPTECPrevisaoOceanica {
	public String getCidade();
	public void setCidade(String cidade);
	public String getEstado();
	public void setEstado(String estado);
	public Timestamp getAtualizadoEm();
	public void setAtualizadoEm(Timestamp atualizadoEm);
	public Onda[] getOndas();
	public void setOndas(Onda[] ondas);
}
