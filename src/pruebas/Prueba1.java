package pruebas;

import controller.FormulaController;

public class Prueba1 {

    public static void main(String[] args) {
        FormulaController frm_ctrl = new FormulaController();

        String sumatoria = String.valueOf(frm_ctrl.generar_vectores(10));
        System.out.println(sumatoria);
    }

}
