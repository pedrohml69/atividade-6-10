class Animal {

    void comer() {
        System.out.println("O animal está comendo.");
    }


    void comer(String comida) {
        System.out.println("O animal está comendo " + comida + ".");
    }


    void comer(String comida, int quantidade) {
        System.out.println("O animal está comendo " + quantidade + " porções de " + comida + ".");
    }
}

class Peixe extends Animal {
    @Override
    void comer() {
        System.out.println("O peixe está comendo algas.");
    }
}


public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal a1 = new Animal();
        a1.comer(); 
        a1.comer("ração"); 
        a1.comer("frutas", 2); 

        System.out.println();

        Animal a2 = new Peixe(); 
        a2.comer(); 
    }
}
