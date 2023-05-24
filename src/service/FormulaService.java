package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FormulaService {

    public double calcular_sumatoria_simple(int N) {
        double num = 3.0, anterior = 0.0, suma = 0.0, division = 0.0;
        int it = 0;

        do {
            it++;
            suma += anterior;
            division = num / it;
            anterior = division;
        } while (it <= N);
        return suma;
    }

    public double calcular_sumatoria_doble(int N) {
        double num = 3.0, anterior = 0.0, sumatoria = 0.0, division = 0.0;
        int it = 0;
        int verifica_operador = 0;

        do {
            it += 2;
            if (verifica_operador == 0) {
                sumatoria += anterior;
                verifica_operador = 1;
            } else {
                sumatoria += anterior;
                verifica_operador = 0;
            }
            division = num / it;
            anterior = division;
        } while (it <= (2 * N));

        return sumatoria;
    }

    public Map<String, String> generar_vectores(int N) {

        int vector1[] = new int[N];
        int vector2[] = new int[N];
        int vectorSuma[] = new int[N];
        ArrayList<Integer> elementosComun = new ArrayList<>();

        for (int i = 0; i < N; ++i) {
            vector1[i] = generateRandomNumber(10, 50);
            vector2[i] = generateRandomNumber(10, 50);
        }

        // Suma de vectores
        for (int i = 0; i < N; ++i) {
            vectorSuma[i] = vector1[i] + vector2[i];
        }

        // Elementos en comun
        for (int i = 0; i < N; ++i) {
            for (int j = 0; j < N; ++j) {
                if (vector1[i] == vector2[j]) {
                    elementosComun.add(vector1[i]);
                }
            }
        }

        Set elementosComunSet = new HashSet<>(elementosComun);

        Map<String, String> valores = Map.of(
                "vector1", Arrays.toString(vector1),
                "vector2", Arrays.toString(vector2),
                "vector_suma", Arrays.toString(vectorSuma),
                "elementos_comun", Arrays.toString(elementosComunSet.toArray()));

        return valores;
    }

    public static int generateRandomNumber(int min, int max) {
        return (int) Math.round((Math.random() * (max - min) + min));
    }
    
    public double TerminoN(int N){
        double TerminoN=0, num=3.0, division = 0.0, anterior = 0.0;
        int it = 1;
        do {
            
            division = num / it;
            anterior = division;
            it++;
        } while (it <= N);
        return division;
    }

}
