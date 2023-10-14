import java.util.Stack;

public class DecimalABinario {
    Stack<Integer> binario = new Stack<>();

    public void transformacion(int decimal) throws Exception {
        if (decimal > 0) {
            while (decimal > 0) {
                int remainder = decimal % 2;
                binario.push(remainder);
                decimal = decimal / 2;
            }
        }else {
            throw new Exception("Ingrese un numero valido");
        }
    }
            public String impresion () {
                StringBuilder binarios = new StringBuilder();
                while (!binario.isEmpty()) {
                    binarios.append(binario.pop());
                }

                return binarios.toString();
            }
        }


