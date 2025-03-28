package Exercicios.Vetores;

public class Interadorexe {
    public static void main(String[] args) {
        container<Integer> container = new container<>(1);

        container.append(2);
        container.append(7);
        container.append(9);
        container.append(12);
        container.append(16);
        container.append(21);
        container.append(27);
        container.append(33);
        container.append(42);
        container.append(54);

        container.get.Lenght();
        container.printList();

        System.out.println("-");
        container.printList();
        System.out.println("--");

        container.insert(16,60);
        container.printList();
    }
}
