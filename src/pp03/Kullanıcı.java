package pp03;

import java.time.LocalDateTime;

public class Kullanıcı {//step 1

    String name;
    LocalDateTime kayıtZamanı;

    public Kullanıcı(String name) {

    }

    public Kullanıcı(String name, LocalDateTime kayıtZamanı) {//obje uretecek full p'li  telescopic const
        this.name = name;
        this.kayıtZamanı = kayıtZamanı;
    }

    @Override
    public String toString() {//objeyi field prınt eden method
        return "Kullanıcı{" +
                "name='" + name + '\'' +
                ", kayıtZamanı=" + kayıtZamanı +
                '}';
    }
}
