public class Main {

    public static void main(String[] args){

        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        int c = calc.divide.apply(a, b); // ошибка в названии и на ноль делить нельзя

        calc.println.accept(c);


    }
}

