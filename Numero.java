import java.math.BigDecimal;
import java.util.Locale;

class Numero {

    private BigDecimal numero = BigDecimal.valueOf(101234.9874);
    private Locale localeBR;

    public Numero() {
        localeBR = new Locale("pt","BR");
    }

    public void um() {
        String resultado = String.format(this.localeBR, "%.2f", numero);
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        new Numero().um();
    }

}