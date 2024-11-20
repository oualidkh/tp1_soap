public class Test {
    public static void main(String[] args) {
        Mother cercle = new Cercle();
        Mother triangle = new Triangle();

        Desstinateurform dessinateur = new Desstinateurform();

        dessinateur.dessinerForme(cercle);
        dessinateur.dessinerForme(triangle);
    }
}
