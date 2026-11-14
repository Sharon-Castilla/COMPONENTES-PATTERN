package casco;

public class CascoHierroSellado implements ProteccionElemental {

    @Override
    public String resistirAtaque(String elemento) {
        if ("FISICO".equalsIgnoreCase(elemento)) {
            return "Golpe fisico bloqueado";
        }
        return "El casco de hierro no aguanta ataques de " + elemento;
    }
}
