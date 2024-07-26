public abstract class HillStations {

    // this is the main method
    public static void main(String[] ags) {

        // below three object creation of subclasses by reference to its parent HillStation class
        HillStations monali = new Monali();
        HillStations gulmarg = new Gulmarg();
        HillStations mussoorie = new Mussoorie();

        // calling monali location method here to access its location
        monali.location();
        // calling monali famousFor method here
        monali.famousFor();

        //  calling mussoorie location method here to access its location
        mussoorie.location();
        //   calling monali famousFor method here
        mussoorie.famousFor();

        //   calling gulmarg location method here to access its location
        gulmarg.location();
        // calling monali famousFor method here
        gulmarg.famousFor();

    }

    abstract void location();

    abstract void famousFor();

}

// creating Monali subclass by extending its parent HillStation class
class Monali extends HillStations {

    // this method decribe where monali is located
    @Override
    void location() {
        System.out.println("Monali is in Himachal Pradesh");
    }

    // this method describe, why Monali is famousfor
    @Override
    void famousFor() {
        System.out.println("It is famous for Hadimba Temple and adventure sports");

    }
}

// creating Mussoorrie subclass by extending its parent HillStation class
class Mussoorie extends HillStations {

    // this method decribe where Mussoorie is located
    @Override
    void location() {
        System.out.println("Mussoorie is in Uttarakhand");
    }

    // this method describe, why Mussoorie is famousfor
    @Override
    void famousFor() {
        System.out.println("It is Famous for education institutions");

    }
}

// creating Gulmarg subclass by extending its parent HillStation class
class Gulmarg extends HillStations {

    // this method decribe where Gulmarg is located
    @Override
    void location() {
        System.out.println("Gulmarg is in J&K");

    }

    // this method describe, why gulmarg is famousfor
    @Override
    void famousFor() {
        System.out.println("It is famous for skiing");
    }
}
