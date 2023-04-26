package view;

import model.Cliente;
import model.Item;
import model.Pessoa;
import model.Produto;
import model.Vendedor;

public class App {
    public static void main(String[] args)
    throws Exception {

    Cliente cliente = new Cliente(
        (byte)33,
        "Gintama",
        "666.666.666-61"
    );
    Vendedor vendedor = new Vendedor(
        (byte)1,
        "Amanda Chorumi",
        "999.999.999-91"
    );

    Item item = new Item(
        new Produto(
            "ABC123",
            "Bolacha",
            3.44f
        ),
        (byte)5
        );
    }
}