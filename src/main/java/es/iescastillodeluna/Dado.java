package es.iescastillodeluna;

import java.util.ArrayList;

public class Dado {

    /**
     * Registro de todas las puntuaciones obtenidas
     */
    private ArrayList<Integer> registro;

    /**
     * Número de caras del dado
     */
    private int caras;

    /**
     * Devuelve un entero entre dos límites enteros, ambos incluidos
     * @param min - El entero inferior.
     * @param max - El entero superior.
     * @return - El entero aleatorio.
     */
    public static int AleatorioEntre(int min, int max) {
        return (int) (Math.random()*max+1-min) + min;
    }

    public Dado(int caras) {
        setCaras(caras);
        registro = new ArrayList<>();
    }

    public int getCaras() {
        return caras;
    }

    public void setCaras(int caras) {
        this.caras = caras;
    }

    public Integer[] getRegistro() {
        return registro.toArray(Integer[]::new);
    }

    /**
     * Devuelve la última tirada del dado o null si no se tiró nunca.
     * @return La última tirada
     */
    public int getUtimo() {
        return registro.isEmpty()?null:registro.get(registro.size() - 1);
    }

    /**
     * Deja el dado como si nunca se hubiera tirado.
     */
    public void reset() {
        registro.clear();
    }

    /**
     * Lanza el dado
     * @return - Resultado del lanzamiento.
     */
    public int lanzar() {
        registro.add(AleatorioEntre(1,6));
        return getUtimo();
    }
}
