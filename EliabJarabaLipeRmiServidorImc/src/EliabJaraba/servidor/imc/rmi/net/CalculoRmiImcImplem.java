package EliabJaraba.servidor.imc.rmi.net;

import eliabRjaraba.seminario.imc.rmi.lib.DatosImc;
import eliabRjaraba.seminario.imc.rmi.lib.IRemotaCalculoImc;

public class CalculoRmiImcImplem implements IRemotaCalculoImc {

    private DatosImc datos;

    public CalculoRmiImcImplem() {
    }

    @Override
    public DatosImc calcularImc(DatosImc datos) {
        float resultado = 0;

        if (datos.getPeso() <= 0 || datos.getAltura() <= 0) {
            datos.setInterpretacion("ERROR: El peso y la altura deben ser mayor que 0");
            return datos;
        } else {
            resultado = datos.getPeso() / (datos.getAltura() * datos.getAltura());
            datos.setResultado(resultado);
            if (resultado < 18.5) {
                datos.setInterpretacion(" Debes consultar de un medico, tu peso es muy bajo ");
            } else if (resultado >= 18.5 && resultado <= 24.9) {
                datos.setInterpretacion("  Estan bien de peso  ");
            } else if (resultado >= 24.9 && resultado <= 29.9) {
                datos.setInterpretacion("  Debes bajar un poco de peso  ");
            } else {
                datos.setInterpretacion("  Debes consultar de un medico, tu peso es muy alto ");
            }
            return datos;
        }
    }

}
