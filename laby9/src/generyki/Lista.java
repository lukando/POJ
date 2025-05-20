package generyki;

public class Lista <E>{
    private E[] lista;
    private int liczbaElementow = 0;

    @SuppressWarnings("unchecked")
    public Lista(int rozmiar){
        lista = (E[]) new Object[rozmiar];
    }

    public boolean dodaj(E element){
        if(liczbaElementow >= lista.length){
            return false;
        } else {
            lista[liczbaElementow++] = element;
            return true;
        }
    }

    public boolean czyZawiera(E element){
        for(int i = 0; i < liczbaElementow; i++){
            if(lista[i].equals(element)){
                return true;
            }
        }
        return false;
    }

    public int zwrocIndeks(E element){
        for(int i = 0; i < liczbaElementow; i++){
            if(lista[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public int zwrocOstatniIndeks(E element){
        for(int i = liczbaElementow - 1; i >= 0; i--){
            if(lista[i].equals(element)){
                return i;
            }
        }
        return -1;
    }

    public E zwrocElement(int indeks){
        if(indeks >= 0 && indeks < liczbaElementow){
            return lista[indeks];
        } else {
            return null;
        }
    }

    public boolean podmienElement(int indeks, E element){
        if(indeks >= 0 && indeks < liczbaElementow){
            lista[indeks] = element;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer("[");
        for (E e : lista) {
            if (e != null) {
                buffer.append(e + ",");
            }
        }
        if (buffer.length()>1) {
            buffer.deleteCharAt(buffer.length() - 1);
        }
        buffer.append("]");
        return buffer.toString();
    }
}
