package App;

import Service.*;

import java.util.Set;

public class App {

    public static void main(String[] args) {
        //Creating address entity
        AddressService service3 = new AddressService();
        service3.add();

        //Creating identity entity
        IdentityService service = new IdentityService();
        service.add();

        //Creating Ogretmen entity
        OgretmenService service2 = new OgretmenService();
        service.add();

        //Creating Ders entity
        DersService service1 = new DersService();
        service.add();

        //Creating Ogrenci entity
        OgrenciService service4 = new OgrenciService();
        service4.add();

    }
}