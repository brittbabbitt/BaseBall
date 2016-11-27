package names;

/**
 * Created by BXB8883 on 11/21/2016.
 */
public class NameGen {
    private String [] names = {
        "Carma Randol",
        "Hans Bassler",
        "Lakesha Ristow",
        "Shari Trembley",
        "Obdulia Lucio",
        "Loreen Brassard",
        "Robbyn Basden",
        "Sheryll Kennerly",
        "Kristan Goheen",
        "Marisela Chica",
        "Griselda Caulkins",
        "Era Netter",
        "Stacy Dimeo",
        "Hisako Fecteau",
        "Rosella Buchner",
        "Marva Marks",
        "Jacinto Scarbrough",
        "Mallory Bremner",
        "Margarett Redden",
        "Darcy Gott",
        "Brinda Rojo",
        "Jospeh Paulin",
        "Mora Pett",
        "Ramiro Salvo",
        "Raina Sen",
        "Rosella Clemens",
        "Aracelis Shumaker",
        "Cyrstal Hanes",
        "Keturah Brugman",
        "Aretha Brogden",
        "Cathy Sevilla",
        "Honey Behm",
        "Candi Gilbreath",
        "Deloise Truby",
        "Many Cornforth",
        "Shanon Olszewski",
        "Nelda Sohn",
        "Margareta Smead",
        "Marcela Bischoff",
        "Narcisa Hassell"
    };

    public String getName(){
        double rand = Math.floor(Math.random()*40);
        int randWhole = (int) rand;
        String name = names[randWhole];
        return name;
    }
}

