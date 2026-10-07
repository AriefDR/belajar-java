package programmer.zaman.now.data;

public interface Car extends HasBrand, isMaintenance {
   void drive(); //default sudah menggunakan public abstract
   int getTier();
   default boolean isBig() {
      return false;
   }
}

