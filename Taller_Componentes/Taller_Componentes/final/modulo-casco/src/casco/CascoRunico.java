package casco;

public class CascoRunico implements ProteccionElemental {

    @Override
    public String resistirAtaque(String elemento) {
        if ("FUEGO".equalsIgnoreCase(elemento)
                || "HIELO".equalsIgnoreCase(elemento)
                || "RAYO".equalsIgnoreCase(elemento)
                || "MAGICO".equalsIgnoreCase(elemento)) {
            return "Las runas absorben el ataque de " + elemento;
        }
        return "El casco runico no protege contra " + elemento;
    }
}
