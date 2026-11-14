package peto;

import core.GemaEnergia;

public class PetoEnlace {

    // el peto tiene su propia energia, por eso el escudo no depende de las botas
    public boolean escudoActivo(GemaEnergia gema) {
        return true;
    }

    // si hay gema con carga el escudo queda reforzado, si no (o si es null) sigue normal
    public boolean escudoReforzado(GemaEnergia gema) {
        return gema != null && gema.tieneCarga();
    }
}
