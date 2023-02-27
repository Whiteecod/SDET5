package Utility;

public class MyFunc {
    public static void Bekle(int saniye) {

            try {
                Thread.sleep(1000*saniye); // ms beklediği için 1000 ile çarpıyoruz
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
    }
}
