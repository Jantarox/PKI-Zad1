public class Main {
    static Integer policz(Integer a, Integer b){
        return a*b;
    }

    public static void main(String[] args) {
        System.out.println("W pierwszym branchu: 2+3 = ".concat(Main.policz(2, 3).toString()));
    }

    }
}
